import java.util.*

plugins {
    kotlin("jvm")
}

repositories {
    google()
    mavenCentral()
}


task("renameSvgFiles") {
    doLast {
        val localPropertiesFile = rootProject.file("local.properties")
        val localProperties = Properties().apply {
            load(localPropertiesFile.reader())
        }
        val phosphorDirPath = localProperties.getProperty("phosphor.dir")
        if (phosphorDirPath.isNullOrEmpty()) {
            println("phosphorDir value not found in local.properties")
            return@doLast
        }
        val iconTypes = listOf("bold", "duotone", "fill", "light", "regular", "thin")
        val phosphorDir = File(phosphorDirPath)
        if (!phosphorDir.exists() || !phosphorDir.isDirectory) {
            logger.error(
                "phosphorDir not found in file system:${phosphorDirPath}"
            )
            return@doLast
        }
        phosphorDir.walk().forEach { file ->
            if (file.isFile) {
                val originalFileName = file.nameWithoutExtension
                val fileType = iconTypes.firstOrNull { originalFileName.endsWith("-$it") }
                val deletedFileName = if (fileType != null) {
                    originalFileName.substringBeforeLast("-$fileType")
                } else originalFileName
                val underlineFileName = deletedFileName.replace('-', '_')
                file.renameTo(File(file.parent, "$underlineFileName.svg"))
            }
        }
    }
}