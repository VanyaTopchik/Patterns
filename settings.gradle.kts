rootProject.name = "otusJava"

pluginManagement {
    val jgitver: String by settings
    val dependencyManagement: String by settings
    val springframeworkBoot: String by settings
    val johnrengelmanShadow: String by settings
    val jib: String by settings
    val protobufVer: String by settings
    val sonarlint: String by settings
    val spotless: String by settings

    plugins {
        id("fr.brouillard.oss.gradle.jgitver") version jgitver
        id("io.spring.dependency-management") version dependencyManagement
        id("org.springframework.boot") version springframeworkBoot
        id("com.github.johnrengelman.shadow") version johnrengelmanShadow
        id("com.google.cloud.tools.jib") version jib
        id("com.google.protobuf") version protobufVer
        id("name.remal.sonarlint") version sonarlint
        id("com.diffplug.spotless") version spotless
    }
}
include("Bridge")
include("AbstractFactory")
include("Adapter")
include("Builder")
include("ChainOfResponsibility")
include("Command")
include("Composite")
include("Decorator")
include("Facade")
include("FactoryMethod")
include("FlyWeight")
include("Iterator")
include("Mediator")
include("Memento")
include("Observer")
include("Prototype")
include("Proxy")
include("Singleton")
include("State")
include("Strategy")
include("TemplateMethod")
include("Visitor")
