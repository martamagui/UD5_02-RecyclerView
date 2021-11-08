package com.marta.ud5_02_recyclerview_martamolina.model

import com.google.gson.annotations.SerializedName

data class Repositories  (
    @SerializedName("repositories")
    val respositoriesGitHub : List<RepositoryResponse>
)
