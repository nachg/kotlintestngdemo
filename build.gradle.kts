plugins {
    kotlin("jvm") version "2.3.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.testng:testng:7.9.0")
    testImplementation("com.willowtreeapps.assertk:assertk:0.28.1")
}

kotlin {
    jvmToolchain(22)
}

tasks.test {
    useTestNG()
}