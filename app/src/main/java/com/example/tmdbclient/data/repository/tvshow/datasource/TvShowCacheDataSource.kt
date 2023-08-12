package com.example.tmdbclient.data.repository.tvshow.datasource

import com.example.tmdbclient.data.model.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache(): List<TvShow>
    suspend fun saveTvShowsToCache(movies: List<TvShow>)
}
