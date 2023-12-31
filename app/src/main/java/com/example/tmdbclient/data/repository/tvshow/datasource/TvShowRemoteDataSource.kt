package com.example.tmdbclient.data.repository.tvshow.datasource

import com.example.tmdbclient.data.model.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getTvShows(): Response<TvShowList>
}
