rootProject.name = "Xiuper"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

// The server image does not build the separate IntelliJ plugin composite build.
include("mpp-core", "mpp-codegraph", "mpp-server")
