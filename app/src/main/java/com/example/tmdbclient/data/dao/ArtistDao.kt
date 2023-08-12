package com.example.tmdbclient.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tmdbclient.data.model.Artist

@Dao
interface ArtistDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveArtists(artists: List<Artist>)

    @Query(value = "SELECT * FROM popular_artists")
    suspend fun getArtists(artists: List<Artist>)

    @Query(value = "DELETE FROM popular_artists")
    suspend fun deleteAllArtists()
}