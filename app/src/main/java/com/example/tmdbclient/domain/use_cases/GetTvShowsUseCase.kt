package com.example.tmdbclient.domain.use_cases

import com.example.tmdbclient.data.model.TvShow
import com.example.tmdbclient.domain.repository.TvShowRepository

class GetTvShowsUseCase(private val repository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = repository.getTvShows()
}