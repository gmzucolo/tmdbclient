package com.example.tmdbclient.data.repository.artist.datasourceImpl

import com.example.tmdbclient.data.db.dao.ArtistDao
import com.example.tmdbclient.data.model.Artist
import com.example.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource

class ArtistLocalDataSourceImpl(
    private val artistDao: ArtistDao
) : ArtistLocalDataSource {
    override suspend fun getArtistsFromDB(): List<Artist> {
        return artistDao.getArtists()
    }

    override suspend fun saveArtistsToDB(artists: List<Artist>) {
        return artistDao.saveArtists(artists)
    }

    override suspend fun clearAll() {
        return artistDao.deleteAllArtists()
    }
}
