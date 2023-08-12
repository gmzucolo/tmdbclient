package com.example.tmdbclient.domain.usecase

import com.example.tmdbclient.data.model.Artist
import com.example.tmdbclient.domain.repository.ArtistRepository

class GetArtistsUseCase(private val repository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = repository.getArtists()
}