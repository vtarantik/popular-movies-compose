package com.example.popular_movies_compose.movies

import com.example.popular_movies_compose.model.Movie

data class MoviesListUiState (
    val moviesList: List<Movie> = emptyList(),
    val loading: Boolean = false,
    val refreshError: Boolean = false,
        )