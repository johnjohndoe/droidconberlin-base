@file:Suppress("MayBeConstant")

package info.metadude.kotlin.library.droidconberlin

object Versions {
    val assertjCore = "3.10.0"
    val gradleBintray = "1.8.3"
    val gradleVersions = "0.20.0"
    val junitJupiter = "5.2.0"
    val kotlin = "1.2.50"
    val kotlinCoroutinesRetrofit = "0.11.0"
    val moshi = "1.6.0"
    val okhttp = "3.10.0"
    val retrofit = "2.4.0"
    val threetenbp = "1.3.6"
}

object GradlePlugins {
    val gradleBintray = "com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.gradleBintray}"
    val gradleVersions = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleVersions}"
    val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Libs {
    val assertjCore = "org.assertj:assertj-core:${Versions.assertjCore}"
    val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junitJupiter}"
    val junitJupiterEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junitJupiter}"
    val kotlinCoroutinesRetrofit = "ru.gildor.coroutines:kotlin-coroutines-retrofit:${Versions.kotlinCoroutinesRetrofit}"
    val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    val threetenbp = "org.threeten:threetenbp:${Versions.threetenbp}"
}
