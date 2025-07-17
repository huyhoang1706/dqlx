import java.time.Year

plugins {
    kotlin("jvm") version "2.1.0"
    id("java-library")
    id("com.diffplug.spotless") version "7.1.0"
}

group = "com.github.huyhoang1706"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

val currentYear = Year.now().value

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    kotlin {
        ktfmt("0.51").googleStyle().configure {
            it.setMaxWidth(80)
            it.setBlockIndent(4)
            it.setContinuationIndent(4)
            it.setRemoveUnusedImports(true)
            it.setManageTrailingCommas(false)
        }
        ktlint().setEditorConfigPath("$projectDir/.editorconfig")
    }

    kotlinGradle {
        target("*.gradle.kts")
        ktlint().setEditorConfigPath("$projectDir/.editorconfig")
    }
}

val dgraph4jVersion = "24.1.1"
val kotlinxVersion = "1.10.2"

dependencies {
    api("io.dgraph:dgraph4j:$dgraph4jVersion")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxVersion")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
