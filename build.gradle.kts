plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")

    //testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    //testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.2")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(8)
}