plugins {
    kotlin("js")
}

kotlin {
    js(IR) {
        browser()
        binaries.library()
    }
}

dependencies {
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-styled")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-extensions")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-mui")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-mui-icons")
    implementation(enforcedPlatform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:1.0.0-pre.348"))
}
