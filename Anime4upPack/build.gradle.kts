apply(plugin = "com.lagradost.cloudstream3.gradle")

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

}

android {
    namespace = "com.anime4up"
    compileSdkVersion(34)
    // Recommended to use the latest

    defaultConfig {
        minSdk = 21
        targetSdk = 34 // Required for Google Play submission
    }
}

cloudstream {
    setRepo("revlin/ArabicRepo")
    authors = listOf("revlin")
    language = "ar"
    status = 1
    tvTypes = listOf("TvSeries", "Movie", "Anime", "Cartoon")
    iconUrl = "https://www.google.com/s2/favicons?domain=akwam.to&sz=%size%"
}


version = 1