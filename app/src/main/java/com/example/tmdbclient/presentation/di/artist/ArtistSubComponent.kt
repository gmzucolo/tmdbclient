package com.example.tmdbclient.presentation.di.artist

import com.example.tmdbclient.presentation.artist.ArtistActivity
import dagger.Subcomponent

//TODO: 3
@ArtistScope
@Subcomponent(modules = [ArtistModule::class])
interface ArtistSubComponent {
    fun inject(artistActivity: ArtistActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(): ArtistSubComponent
    }
}
