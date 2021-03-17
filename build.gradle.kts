plugins {
    java
    kotlin("jvm") version "1.4.31"
}

group = "com.github.imalwayscoding"
version = "0.0.1"

repositories {
    google()
    jcenter()
    mavenCentral()

    maven(url = "https://jitpack.io/")
}

dependencies {
    implementation(kotlin("stdlib"))
    testCompile("junit", "junit", "4.12")
}
