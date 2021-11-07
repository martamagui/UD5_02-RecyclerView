package com.marta.ud5_02_recyclerview_martamolina.model

import com.google.gson.annotations.SerializedName

data class Owner(
    @SerializedName("login")
    val ownerName : String,
    @SerializedName("id")
    val ownerId: Int,
    @SerializedName("node_id")
    val ownerNodeId: String,
    @SerializedName("avatar_url")
    val ownerAvatarUrl : String,
    @SerializedName("gravatar_id")
    val ownerGravatar_id :  String,
    @SerializedName("url")
    val ownerUrl: String,
    @SerializedName("html_url")
    val ownerHtmlUrl: String,
    @SerializedName("followers_url")
    val ownerFollowersUrl: String,
    @SerializedName("following_url")
    val ownerFollowingUrl :String,
    @SerializedName("gists_url")
    val ownerGistsUrl :  String,
    @SerializedName("starred_url")
    val ownerStarredUrl: String,
    @SerializedName("subscriptions_url")
    val ownerSubscriptionsUrl : String,
    @SerializedName("organizations_url")
    val ownerOrganizationsUrl : String,
    @SerializedName("repos_url")
    val ownerReposUrl: String,
    @SerializedName("events_url")
    val ownerEventsUrl : String,
    @SerializedName("received_events_url")
    val ownerReceivedEventsUrl: String,
    @SerializedName("type")
    val ownerType : String,
    @SerializedName("site_admin")
    val ownerSiteAdmin : Boolean
)
