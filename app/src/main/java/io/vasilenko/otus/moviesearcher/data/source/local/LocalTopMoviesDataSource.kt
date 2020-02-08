package io.vasilenko.otus.moviesearcher.data.source.local

import io.vasilenko.otus.moviesearcher.data.local.LocalTopMovieStorage
import io.vasilenko.otus.moviesearcher.data.mapper.LocalMovieMapper
import io.vasilenko.otus.moviesearcher.data.source.TopMoviesDataSource
import io.vasilenko.otus.moviesearcher.domain.entity.MovieEntity

class LocalTopMoviesDataSource(private val movieMapper: LocalMovieMapper) :
    TopMoviesDataSource {

    override fun getAllMovies(): List<MovieEntity> {
        return movieMapper.mapLocalMovieDtoToMovieEntity(LocalTopMovieStorage.movies)
    }
}