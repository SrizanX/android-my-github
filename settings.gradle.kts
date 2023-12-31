pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
rootProject.name = "MyGithub"
include(":app")
include(":domain")
include(":feature")
include(":core:network")
include(":core:database")
include(":core:data")
include(":feature:list")
include(":feature:details")
include(":common")
