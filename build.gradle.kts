import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.springframework.boot") version "2.3.1.RELEASE"
  id("io.spring.dependency-management") version "1.0.9.RELEASE"
  war
  kotlin("jvm") version "1.3.72"
  kotlin("plugin.spring") version "1.3.72"
}

group = "apiInventario"
version = "1.0"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
  mavenCentral()
  flatDir {
    this.dir("libs")
  }
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-security")
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.springframework.data:spring-data-commons")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  //
  //implementation("org.sql2o:sql2o:1.6.0")
  //implementation("mysql:mysql-connector-java:5.1.48")
  //implementation("com.zaxxer:HikariCP:3.4.1")
  //
  providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testImplementation("org.springframework.security:spring-security-test")
  testImplementation("org.mockito:mockito-core:2.21.0")
  //LocalLibs
  implementation(files("libs/coletor.jar"))
  implementation(fileTree(baseDir = "libs"))
}

tasks.withType<Test> {
  useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs = listOf("-Xjsr305=strict")
    jvmTarget = "1.8"
  }
}
