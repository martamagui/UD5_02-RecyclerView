package com.marta.ud5_02_recyclerview_martamolina

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.glideImg(
    linkImg: String?
) {
    Glide.with(this.context)
        .load(convertUrl(linkImg))
        .placeholder(R.drawable.resource_default)
        .into(this)
}

fun convertUrl(
    url: String?
): String? {
    return url?.replace(" ", "")?.lowercase()
}

fun topicsToHastags(
    topics: List<String>?
): String {
    var hastags: String = "Tags: \n"
    if (topics != null) {
        for (item in topics) {
            hastags += " #$item,"
        }
    }
    hastags = hastags?.dropLast(1)
    return hastags
}