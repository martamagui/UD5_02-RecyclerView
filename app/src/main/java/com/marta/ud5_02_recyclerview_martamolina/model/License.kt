package com.marta.ud5_02_recyclerview_martamolina.model

import com.google.gson.annotations.SerializedName

data class License(
    @SerializedName("key")
    val licenseKey: String,
    @SerializedName("name")
    val licenseName : String,
    @SerializedName("spdx_id")
    val licenseSpdxId : String,
    @SerializedName("url")
    val licenseUrl: String,
    @SerializedName("node_id")
    val licenseNodeId : String
)