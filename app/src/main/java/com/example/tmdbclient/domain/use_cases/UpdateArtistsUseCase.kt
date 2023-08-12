package com.example.tmdbclient.domain.use_cases

import com.example.tmdbclient.data.model.Artist
import com.example.tmdbclient.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.updateArtists()
}
