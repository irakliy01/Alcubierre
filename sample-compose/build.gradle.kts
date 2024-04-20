plugins {
    alias(libs.plugins.buildlogic.android.app)
    alias(libs.plugins.buildlogic.compose)
    id(libs.plugins.kotlin.parcelize.get().pluginId)
}

android {
    namespace = "com.github.octaone.alcubierre.sample"
}

dependencies {
    implementation(projects.alcubierre)
    implementation(projects.alcubierreRenderCompose)

    implementation(libs.bundles.compose)
    implementation(libs.kotlin.coroutines.android)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.core)
    implementation(libs.androidx.lifecycle.compose)
    implementation(libs.androidx.savedstate)
}
