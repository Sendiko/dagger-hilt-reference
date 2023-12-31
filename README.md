# Dependency Injection with Dagger Hilt and Compose

this is not the real case usage, just for reference.

### Adding dependencies
---
1. In project module level ```build.gradle``` add:
   
   ```id("com.google.dagger.hilt.android") version "2.48" apply false ```

2. Then in app module level ```build.gradle``` add this:

  ```gradle
    plugins {
      id("com.android.application")
      id("org.jetbrains.kotlin.android")
      id("kotlin-kapt")
      id("dagger.hilt.android.plugin")
    }
  ```
  ```gradle
  dependencies {
    implementation("com.google.dagger:hilt-android:2.48")
    implementation("androidx.hilt:hilt-work:1.1.0")
    implementation("androidx.work:work-runtime-ktx:2.9.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.1.0")
    kapt("com.google.dagger:hilt-android-compiler:2.48")
  }
  ```

3. Sync and Rebuild

### Project Structure
---

this is a quick peek of how i think the project structure should be:

```
  com.example.dagger-ex
   -- di
      -- AppModule.kt
   -- network/data
      -- response(if any)
         ExampleResponse.kt
      -- services
         ExampleService.kt
      ExampleApi.kt
  -- ui
     -- screens
        ExampleScreen.kt
        ExampleViewModel.kt
  MainActivity.kt
  ExampleApp.kt
```

### Implementation
---

The usage implementation of Dagger Hilt to inject Room Database can be seen [here.](https://github.com/Sendiko/dagger-hilt-room)

The usage implementation of Dagger Hilt to inject Retrofit can be seen [here.](https://github.com/Sendiko/dagger-hilt-retrofit)

## with love, Sendiko


