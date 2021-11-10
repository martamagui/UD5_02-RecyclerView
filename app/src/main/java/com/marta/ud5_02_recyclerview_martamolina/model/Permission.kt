package com.marta.ud5_02_recyclerview_martamolina.model

import com.google.gson.annotations.SerializedName

data class Permission(
    @SerializedName("admin")
    val admin: Boolean,
    @SerializedName("maintain")
    val maintain: Boolean,
    @SerializedName("push")
    val push: Boolean,
    @SerializedName("triage")
    val triage: Boolean,
    @SerializedName("pull")
    val pull: Boolean
)
