package com.example.tmdbclient.domain.use_cases

import com.example.tmdbclient.data.model.Movie
import com.example.tmdbclient.domain.repository.MovieRepository

class UpdateMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()
}
