import org.gradle.api.JavaVersion

object Config {
    const val application_id = "ru.loginovalexeydevelopment.jetpack_app"
    const val compile_sdk = 30
    const val min_sdk = 21
    const val target_sdk = 30
    val java_version = JavaVersion.VERSION_1_8
}

object Releases {
    const val version_code = 1
    const val version_name = "1.0"
}

object Modules {
    const val app = ":app"
    const val core = ":core"
    const val model = ":model"
    const val repository = ":repository"
    const val utils = ":utils"
}

object Versions {
    // Tools
    const val multidex = "1.0.3"

    // Design
    const val appcompat = "1.3.1"
    const val material = "1.4.0"

    // Kotlin
    const val core = "1.6.0"
    const val stdlib = "1.3.41"
    const val coroutinesCore = "1.2.1"
    const val coroutinesAndroid = "1.1.1"
    const val lifecycle = "2.3.1"

    // Retrofit
    const val retrofit = "2.6.0"
    const val converterGson = "2.6.0"
    const val interceptor = "3.12.1"
    const val adapterCoroutines = "0.9.2"

    // Glide
    const val glide = "4.9.0"
    const val glideCompiler = "4.9.0"

    // Picasso
    const val picasso = "2.5.2"

    // Room
    const val roomKtx = "2.2.0-alpha01"
    const val runtime = "2.2.0-alpha01"
    const val roomCompiler = "2.2.0-alpha01"

    // Compose
    const val compose_kotlin_compiler_version = "1.5.10"
    const val compose_version = "1.0.0"
    const val activity_compose = "1.3.1"

    // Test
    const val jUnit = "4.+"
    const val ext_jUnit = "1.1.3"
    const val runner = "1.2.0"
    const val espresso = "3.4.0"
}

object Design {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
}

object Kotlin {
    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.stdlib}"
    const val coroutines_core =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}"
    const val coroutines_android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}"
}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val converter_gson = "com.squareup.retrofit2:converter-gson:${Versions.converterGson}"
    const val adapter_coroutines =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.adapterCoroutines}"
    const val logging_interceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.interceptor}"
}

object Glide {
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glideCompiler}"
}

object Picasso {
    const val picasso = "com.squareup.picasso:picasso:${Versions.picasso}"
}

object Room {
    const val runtime = "androidx.room:room-runtime:${Versions.runtime}"
    const val compiler = "androidx.room:room-compiler:${Versions.roomCompiler}"
    const val room_ktx = "androidx.room:room-ktx:${Versions.roomKtx}"
}

object TestImpl {
    const val junit = "junit:junit:${Versions.jUnit}"
    const val ext_junit = "'androidx.test.ext:junit:${Versions.ext_jUnit}"
    const val runner = "androidx.test:runner:${Versions.runner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val ui_test_jUnit = "androidx.compose.ui:ui-test-junit4:${Versions.compose_version}"
}

object Compose {
    const val ui = "androidx.compose.ui:ui:${Versions.compose_version}"
    const val material = "androidx.compose.material:material:${Versions.compose_version}"
    const val tooling_preview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose_version}"
    const val activity = "androidx.activity:activity-compose:${Versions.activity_compose}"
}

object Debug {
    const val ui_tooling = "androidx.compose.ui:ui-tooling:${Versions.compose_version}"
}