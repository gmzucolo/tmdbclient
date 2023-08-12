package com.example.tmdbclient.data.repository.artist.datasource

import com.example.tmdbclient.data.model.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache(): List<Artist>
    suspend fun saveArtistsToCache(artists: List<Artist>)
}
