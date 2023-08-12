package com.example.tmdbclient.data.repository.movie.datasourceImpl

import com.example.tmdbclient.data.db.dao.MovieDao
import com.example.tmdbclient.data.model.Movie
import com.example.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource

class MovieLocalDataSourceImpl(
    private val movieDao: MovieDao
) : MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> {
        return movieDao.getMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        return movieDao.saveMovies(movies)
    }

    override suspend fun clearAll() {
        return movieDao.deleteAllMovies()
    }
}
