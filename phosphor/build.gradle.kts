plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
    id("maven-publish")
}

group = "top.notbe"
version = "0.1"

repositories {
    google()
    mavenCentral()
}

kotlin {
    jvm("jvm") {
        jvmToolchain(11)
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    android()
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
            }
        }
    }
    android {
        publishLibraryVariants("release")
    }
}

android {
    namespace = "top.notbe.phosphor"
    compileSdk = 32
    defaultConfig {
        minSdk = 24
        targetSdk = 32

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}
