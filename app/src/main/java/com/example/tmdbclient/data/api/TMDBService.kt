package com.example.tmdbclient.data.api

import com.example.tmdbclient.data.ArtistList
import com.example.tmdbclient.data.MovieList
import com.example.tmdbclient.data.TvShowList
import com.example.tmdbclient.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {
    @GET("movie/popular")
    suspend fun getPopularMovies(@Query(Constants.API_KEY) apiKey: String): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShows(@Query(Constants.API_KEY) apiKey: String): Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtists(@Query(Constants.API_KEY) apiKey: String): Response<ArtistList>
}