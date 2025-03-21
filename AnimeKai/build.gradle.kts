// use an integer for version numbers
version = 1

cloudstream {
    language = "en"
    // All of these properties are optional, you can safely remove them
    description = "Animes & Animes Movie"
    authors = listOf("kerimmkirac")
    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "Anime",
        "OVA",
        "AnimeMovie"
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=animekai.to&sz=%size%"

    isCrossPlatform = true
}
