package com.lapki.app1.data

import com.google.gson.annotations.SerializedName

data class Quote(
    @SerializedName("site") val site: String,
    @SerializedName("name") val name: String,
    @SerializedName("desc") val desc: String,
    @SerializedName("elementPureHtml") val htmlText: String,
    @SerializedName("link") val link: String
)


data class SourcesOfQuotes(
    @SerializedName("site") val site: String,
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String,
    @SerializedName("parsel") val parsel: String,
    @SerializedName("encoding") val encoding: String,
    @SerializedName("linkpar") val linkpar: String,
    @SerializedName("desc") val desc: String
)
