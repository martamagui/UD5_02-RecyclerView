package com.marta.ud5_02_recyclerview_martamolina.model

data class Repository(
    val name: String,
    val description: String,
    val ownerAvatarUrl: String,
    val ownerName: String,
    val licenseName: String,
    val topics: List<String>,
    val language: String
) {
    constructor(repositoryResponse: RepositoryResponse) : this(
        repositoryResponse.name,
        repositoryResponse.description,
        repositoryResponse.owner.ownerAvatarUrl,
        repositoryResponse.owner.ownerName,
        repositoryResponse.license.licenseName,
        repositoryResponse.topics,
        repositoryResponse.language
    )
}

fun RepositoryResponse.toRepository(): Repository {
    return Repository(
        this.name,
        this.description,
        this.owner.ownerAvatarUrl,
        this.owner.ownerName,
        this.license.licenseName,
        this.topics,
        this.language
    )
}

fun List<RepositoryResponse>.toRepository(): List<Repository>{
    return this.map{it.toRepository()}
}


