plugins {
  kotlin("js") version "1.7.20"
  kotlin("plugin.serialization") version "1.7.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
  jcenter()
}

dependencies {
  implementation(kotlin("stdlib-js", "1.7.20"))
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:1.4.1")
  implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.7.1")
}

kotlin.target.browser()
