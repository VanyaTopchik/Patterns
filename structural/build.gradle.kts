plugins {
    id("java")
}

group = "pattern"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("ch.qos.logback:logback-classic")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}