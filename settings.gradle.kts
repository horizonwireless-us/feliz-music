@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        mavenLocal()
        google()
        gradlePluginPortal()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        mavenLocal()
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
    }
}

// F-Droid doesn't support foojay-resolver plugin
// plugins {
//     id("org.gradle.toolchains.foojay-resolver-convention") version("1.0.0")
// }

rootProject.name = "Zemer"
include(":app")
include(":innertube")
include(":lrclib")
include(":simpmusic")

// Cipher library (sibling checkout). The local default is the sibling
// ../feliz-cipher checkout; CI overrides it with -PfelizCipherPath=.deps/feliz-cipher
// after checking out the exact commit pinned in deps/cipher.lock.
val felizCipherPath = providers.gradleProperty("felizCipherPath")
    .getOrElse("../feliz-cipher")
includeBuild(felizCipherPath) {
    dependencySubstitution {
        substitute(module("com.zemer:cipher")).using(project(":library"))
    }
}

// Use a local copy of NewPipe Extractor by uncommenting the lines below.
// We assume, that Zemer and NewPipe Extractor have the same parent directory.
// If this is not the case, please change the path in includeBuild().
//
// For this to work you also need to change the implementation in innertube/build.gradle.kts
// to one which does not specify a version.
// From:
//      implementation(libs.newpipe.extractor)
// To:
//      implementation("com.github.teamnewpipe:NewPipeExtractor")
//includeBuild("../NewPipeExtractor") {
//    dependencySubstitution {
//        substitute(module("com.github.teamnewpipe:NewPipeExtractor")).using(project(":extractor"))
//    }
//}
