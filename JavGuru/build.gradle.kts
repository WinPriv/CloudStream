dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}

// use an integer for version numbers
version = 5

cloudstream {
    // All of these properties are optional, you can safely remove any of them.

    description = ""
    authors = listOf("Jace")

    /**
     * Status int as one of the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta-only
     **/
    status = 3 // Will be 3 if unspecified

    tvTypes = listOf("NSFW")

    requiresResources = true
    language = "en"

    iconUrl = "https://www.google.com/s2/favicons?domain=jav.guru&sz=%size%"
}

android {
    buildFeatures {
        buildConfig = true
        viewBinding = true
    }
}
