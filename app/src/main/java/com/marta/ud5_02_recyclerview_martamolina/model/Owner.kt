package com.marta.ud5_02_recyclerview_martamolina.model

import com.google.gson.annotations.SerializedName

data class Owner(
    @SerializedName("login")
    val login : String,
    @SerializedName("id")
    val ownerId: Int,
    @SerializedName("node_id")
    val OwnerNodeId: String,
    @SerializedName("avatar_url")
    val avatarUrl : String,
    @SerializedName("gravatar_id")
    val gravatar_id :  String,
    @SerializedName("url")
    val url: String,
    @SerializedName("html_url")
    val ownerHtmlUrl: String,
    @SerializedName("followers_url")
    val followersUrl: String,
    @SerializedName("following_url")
    val followingUrl :String,
    @SerializedName("gists_url")
    val gistsUrl :  String,
    @SerializedName("starred_url")
    val starredUrl: String,
    @SerializedName("subscriptions_url")
    val subscriptionsUrl : String,
    @SerializedName("organizations_url")
    val organizationsUrl : String,
    @SerializedName("repos_url")
    val reposUrl: String,
    @SerializedName("events_url")
    val eventsUrl : String,
    @SerializedName("received_events_url")
    val receivedEventsUrl: String,
    @SerializedName("type")
    val type : String,
    @SerializedName("site_admin")
    val siteAdmin : Boolean
)
