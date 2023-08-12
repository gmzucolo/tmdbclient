package com.example.tmdbclient.data.repository.tvshow.datasourceImpl

import com.example.tmdbclient.data.db.dao.TvShowDao
import com.example.tmdbclient.data.model.TvShow
import com.example.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource

class TvShowLocalDataSourceImpl(
    private val tvShowsDao: TvShowDao
) : TvShowLocalDataSource {
    override suspend fun getTvShowsFromDB(): List<TvShow> {
        return tvShowsDao.getTvShows()
    }

    override suspend fun saveTvShowsToDB(movies: List<TvShow>) {
        return tvShowsDao.saveTvShows(movies)
    }

    override suspend fun clearAll() {
        return tvShowsDao.deleteAllTvShows()
    }
}
