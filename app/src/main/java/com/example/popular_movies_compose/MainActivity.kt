package com.example.popular_movies_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.popular_movies_compose.movies.MoviesListScreen
import com.example.popular_movies_compose.ui.theme.PopularMoviesComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MoviesListScreen()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    PopularMoviesComposeTheme {
        Surface(color = MaterialTheme.colors.surface) {
            content()
        }
    }
}

@Preview(showBackground = true, name = "Movie preview")
@Composable
fun DefaultPreview() {
    MyApp {
        MoviesListScreen()
    }
}