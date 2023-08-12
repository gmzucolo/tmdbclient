package com.example.tmdbclient.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tmdbclient.data.model.Movie

@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movies: List<Movie>)

    @Query(value = "SELECT * FROM popular_movies")
    suspend fun getMovies(): List<Movie>

    @Query(value = "DELETE FROM popular_movies")
    suspend fun deleteAllMovies()
}

