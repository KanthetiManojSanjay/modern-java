plugins {
    id("java")
}

group = "org.example"
version = ""


repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":modules:moduletwo"))
    implementation(project(":modules:moduleone"))

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}
java {
    sourceCompatibility = JavaVersion.VERSION_19
    targetCompatibility = JavaVersion.VERSION_19
}
