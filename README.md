# lib

A java library I made to learn [javadoc](https://docs.oracle.com/en/java/javase/21/javadoc/javadoc.html) and publishing
packages with [gh actions](https://docs.github.com/en/actions)

## Add to maven
```
<dependency>
  <groupId>net.raphdf201</groupId>
  <artifactId>lib</artifactId>
  <version>0.1</version>
</dependency>
```

## Add to gradle
### Groovy (build.gradle)
```
repositories {
    maven {
        url = "https://maven.pkg.github.com/raphdf201/lib"
        credentials {
            username = "raphdf201"
            password = "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"
        }
    }
    mavenCentral() // Add mavenCentral() or other needed repos.
}

dependencies {
    implementation 'net.raphdf201:lib:0.2'
}
```

### Kotlin (build.gradle.kts)
```
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/raphdf201/lib")
        credentials {
            username = "raphdf201"
            password = "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"
        }
    }
    mavenCentral() // Add mavenCentral() or other needed repos.
}

dependencies {
    implementation("net.raphdf201:lib:0.2")
}
```
