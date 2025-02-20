plugins {
    id("java")
    id("maven-publish")
}

group = "net.raphdf201"
version = "0.2"

repositories {
    mavenCentral()
}

dependencies {}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "net.raphdf201"
            artifactId = "lib"
            version = "0.2"

            from(components["java"])
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/raphdf201/lib")
            credentials {
                username = "Raphdf201"
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
