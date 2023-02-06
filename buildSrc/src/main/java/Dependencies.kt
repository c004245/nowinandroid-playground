// Dependencies.kt
object Versions {

    // AndroidX
    const val APP_COMPAT = "1.6.0"
    const val MATERIAL = "1.8.0"
    const val CONSTRAINT_LAYOUT = "2.1.4"

    // KTX
    const val CORE = "1.7.0"

    // TEST
    const val JUNIT = "1.1.5"

    // Android Test
    const val ESPRESSO_CORE = "3.5.1"
}

object Libraries {

    object AndroidX {
        const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
        const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    }

    object KTX {
        const val CORE = "androidx.core:core-ktx:${Versions.CORE}"
    }

    object Test {
        const val JUNIT = "androidx.test.ext:junit:${Versions.JUNIT}"
    }

    object AndroidTest {
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
    }

}