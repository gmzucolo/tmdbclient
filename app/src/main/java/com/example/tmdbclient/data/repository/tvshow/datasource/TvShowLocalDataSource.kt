package com.example.tmdbclient.data.repository.tvshow.datasource

import com.example.tmdbclient.data.model.TvShow

interface TvShowLocalDataSource {
    suspend fun getTvShowsFromDB(): List<TvShow>
    suspend fun saveTvShowsToDB(movies: List<TvShow>)
    suspend fun clearAll()
}
