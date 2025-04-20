rootProject.name = "CloudstreamArabicRepo"

val disabled = listOf<String>("EgyBestProvider")

File(rootDir, ".").eachDir { dir ->
    if (!disabled.contains(dir.name) && File(dir, "build.gradle.kts").exists()) {
        include(dir.name)
    }
}

fun File.eachDir(block: (File) -> Unit) {
    listFiles()?.filter { it.isDirectory }?.forEach { block(it) }
}

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        maven("https://jitpack.io")
    }
}



