plugins {
    kotlin("jvm") version "2.1.0"
    id("java-library")
}

group = "com.github.huyhoang1706"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

val dgraph4jVersion = "24.1.1"

dependencies {
    api("io.dgraph:dgraph4j:$dgraph4jVersion")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}