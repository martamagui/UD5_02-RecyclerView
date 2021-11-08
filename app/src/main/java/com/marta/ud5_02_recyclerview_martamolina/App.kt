package com.marta.ud5_02_recyclerview_martamolina

import android.app.Application
import com.marta.ud5_02_recyclerview_martamolina.model.Repository

class App : Application() {
    val repositoriesList: MutableList<Repository> = mutableListOf()
}