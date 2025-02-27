# How to Secure API keys in android we will see 2 different approaches to do that

### this is only for demo purpose please don't add gradle.properties and local.properties into git

## 1. Using gradle.properties - Recommended to use
- By default, Gradle uses a file called gradle.properties in the root directory for Android Projects. This extension file is widely used in Java projects, so it is also used for Android projects. The file has a simple key — value data structure.
- Declare two variable in gradle.properties file 
```kotlin
API_BASE_URL="http://example.com"
API_BASE_URL_PROD="http://example-prod.com"
```
- By default, there area properties file in Gradle Home where Gradle system lives in your environment, they are loaded automatically by Gradle— if the filename is gradle.properties— we can use these variables in app/build.gradle just writing their names just like.
```python
buildConfigField "String", "BASE_URL", API_BASE_URL
```
- Use this with different build types
- And finally we use this defined field in our kotlin file directly
``` kotlin
var apiKey = BuildConfig.API_KEY
```

## 2. Using local.properties