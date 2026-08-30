# AGENTS.md — android-client

## Purpose and visibility

Public repository `horizonwireless-us/feliz-music`: the Feliz Music Android app.
Forked from `ZemerTeam/zemer-app` (upstream remote preserved); the future
`origin` is reserved for `https://github.com/horizonwireless-us/feliz-music`.

The inherited Zemer technical notes are preserved as
[`docs/legacy-zemer-agents.md`](docs/legacy-zemer-agents.md) — reference
material only. The Feliz contract in this file takes precedence.

## Package IDs and variants

- Stable: `com.jtech.felizmusic` (product flavor `stable`, tag-triggered GitHub
  Releases). Monotonically increasing `versionCode`.
- Nightly: `com.jtech.felizmusic.nightly` (product flavor `nightly`,
  `applicationIdSuffix = ".nightly"`, built from `main`, distributed via
  nightly.link). Separate Firebase registration and separate signing key;
  installs alongside stable with independent local data.
- Update checks use the public GitHub Releases API for stable; the in-place
  Firebase/`updates.horizonwireless.us` channel switch is removed.

## Sibling dependencies

- `feliz-cipher` is consumed via Gradle composite build. Local default path
  `../feliz-cipher`; CI uses `-PfelizCipherPath=.deps/feliz-cipher` after
  `scripts/checkout-cipher.sh`, which reads `deps/cipher.lock` (pinned commit).
- Bento4 native code is vendored under `app/src/main/cpp/bento4` and built from
  source by CMake (license: `app/src/main/cpp/bento4/LICENSE.bento4.md`).
- The offline subset is produced by `search-service/index/build-subset.mjs` and
  consumed by `offline/` (SubsetDecoder etc.).

## Firebase boundary and secrets

- `app/google-services.json` is ignored and generated in CI from the
  `GOOGLE_SERVICES_JSON_BASE64` secret (stable) and
  `GOOGLE_SERVICES_JSON_NIGHTLY_BASE64` (nightly). Never commit either.
- `app/persistent-debug.keystore` and release keystores are ignored/operator-managed.
  `local.properties` is ignored.
- The Firestore debug default project is `feliz-music-admin` (passed via
  `-PfirebaseProjectId=`); do not hardcode Zemer's project id.

## Acappella contract

- Canonical names: `isAcappella`, `acappellaOnly`, `onlyAcappella`.
- DataStore: `AcappellaOnlyKey` (boolean). Legacy `allowFemaleSingers` and
  `femalePasscodeHash` keys are deleted at startup and after sync and are never
  mapped to Acappella.
- `ContentFilterConfig`/`ContentFilterState` carry `acappellaOnly`; there is no
  `allowsFemale()` or female passcode. `onlyAcappella=0`/absent is unrestricted;
  `1` restricts music to owning-artist `isAcappella`.
- `BlockedIdsCache` and the offline subset `SubBlocked` are global-only. No
  `female`/`REASON_FEMALE` bucket.
- Whitelist entities: `ArtistWhitelistEntity.isAcappella` (explicit boolean);
  `PodcastWhitelistEntity` has no `isFemale`. Podcasts ignore `onlyAcappella`
  everywhere (search, offline subset, whitelist gates, library surfaces).
- Offline subset artist/channel flag bit 0 = `isAcappella`. The female-credit
  matcher was replaced with the owning-artist flag; no featured-credit gender
  inference, no curator-ownership rule.
- Room schema: clean-install boundary. If the app is reinstalled, old schema
  JSONs regenerate; legacy columns must not be reintroduced.

## Build/test commands

```sh
# local (JDK 21, Android SDK 36 + NDK 27 + CMake 3.22.1)
./gradlew :app:testStableDebugUnitTest -PfirebaseProjectId=feliz-music-admin
./gradlew :app:assembleStableDebug   -PfirebaseProjectId=feliz-music-admin
./gradlew :app:assembleStableRelease -PfirebaseProjectId=feliz-music-admin
./gradlew :app:assembleNightlyRelease -PfirebaseProjectId=feliz-music-admin
bash scripts/check-16kb-alignment.sh app/build/outputs/apk/stable/release/*.apk
```

CI workflows: `pr-checks.yml` (unit tests, cipher tests, UI audit, debug
assembly, release compile, 16 KB check), `release.yml` (stable tag release),
`nightly.yml` (main nightly build).

## Release identities and signing

- Stable key: operator-managed, offline only, two backups. Nightly key:
  separate, CI-only, automated builds. Neither is committed.
- CI `google-services.json` is generated from secrets per variant.
