package com.marta.ud5_02_recyclerview_martamolina

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import com.marta.ud5_02_recyclerview_martamolina.model.Repository

class App : Application() {
    val repositoriesList: MutableList<Repository> = mutableListOf()
}
val AppCompatActivity.app: App
    get() = this.application as App