plugins{
    alias(libs.plugins.jetbrains.kotlin.multiplatform)
}

kotlin{
    jvm("desktop")

    sourceSets{
        val desktopTest by getting

        desktopTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

