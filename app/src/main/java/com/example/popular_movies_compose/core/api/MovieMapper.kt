package com.example.popular_movies_compose.core.api

import com.example.popular_movies_compose.model.Movie
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieMapper @Inject constructor() {

    fun mapToDomain(entity: PopularMovieEntity): Movie {
        return Movie(
            entity.posterPath,
            entity.adult,
            entity.overview,
            entity.releaseDate,
            entity.genreIds,
            entity.id,
            entity.originalTitle,
            entity.originalLanguage,
            entity.title,
            entity.backdropPath,
            entity.popularity,
            entity.voteCount,
            entity.video,
            entity.voteAverage,
        )
    }
}