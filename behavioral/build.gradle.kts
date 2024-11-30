plugins {
    id("java")
}

group = "pattern"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("ch.qos.logback:logback-classic")
    implementation ("org.springframework.boot:spring-boot-starter-web")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}