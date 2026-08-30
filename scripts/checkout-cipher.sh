#!/usr/bin/env bash
# Check out the pinned Feliz cipher commit into .deps/feliz-cipher.
#
# Reads deps/cipher.lock (tracked). Used by CI before Gradle runs with
# -PfelizCipherPath=.deps/feliz-cipher, and usable by developers who do not
# have the sibling ../feliz-cipher checkout.
#
#   bash scripts/checkout-cipher.sh
#
# Exits non-zero if the lock file is missing/invalid or the checkout fails.
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
LOCK="$ROOT/deps/cipher.lock"

if ! command -v jq >/dev/null 2>&1; then
    echo "jq is required to read deps/cipher.lock" >&2
    exit 2
fi

if [ ! -f "$LOCK" ]; then
    echo "Missing $LOCK" >&2
    exit 2
fi

REPO="$(jq -r '.repo' "$LOCK")"
DEST_REL="$(jq -r '.path' "$LOCK")"
COMMIT="$(jq -r '.commit' "$LOCK")"
DEST="$ROOT/$DEST_REL"

case "$REPO" in
    https://github.com/*) ;;
    *)
        echo "Refusing non-HTTPS cipher repo in lock: $REPO" >&2
        exit 2
        ;;
esac

if [ -d "$DEST/.git" ]; then
    echo "Updating existing cipher checkout at $DEST_REL"
    git -C "$DEST" fetch origin main
    if ! git -C "$DEST" checkout --detach "$COMMIT" 2>/dev/null; then
        # Lock commit not on main (e.g. an older pinned revision): fetch it directly.
        git -C "$DEST" fetch origin "$COMMIT"
        git -C "$DEST" checkout --detach "$COMMIT"
    fi
else
    echo "Cloning cipher commit $COMMIT into $DEST_REL"
    mkdir -p "$(dirname "$DEST")"
    # Full clone (no --filter): the checkout below must never need an object fetch,
    # because GitHub refuses lazy/raw-SHA object requests from unauthenticated clones.
    git clone "$REPO" "$DEST"
    if ! git -C "$DEST" checkout --detach "$COMMIT" 2>/dev/null; then
        git -C "$DEST" fetch origin "$COMMIT"
        git -C "$DEST" checkout --detach "$COMMIT"
    fi
fi

ACTUAL="$(git -C "$DEST" rev-parse HEAD)"
if [ "$ACTUAL" != "$COMMIT" ]; then
    echo "Cipher checkout mismatch: expected $COMMIT, got $ACTUAL" >&2
    exit 1
fi

# The cipher library is an Android Gradle project; CI writes this itself if
# needed, but keep the checkout self-contained for local tooling.
if [ -z "${ANDROID_SDK_ROOT:-}" ] && [ -z "${ANDROID_HOME:-}" ]; then
    echo "Note: ANDROID_SDK_ROOT/ANDROID_HOME not set — Gradle builds need one." >&2
fi

echo "Cipher ready at $DEST_REL @ $COMMIT"
