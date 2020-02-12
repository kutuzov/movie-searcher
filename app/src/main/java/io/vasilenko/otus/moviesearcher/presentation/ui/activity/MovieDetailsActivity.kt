package io.vasilenko.otus.moviesearcher.presentation.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import io.vasilenko.otus.moviesearcher.R
import io.vasilenko.otus.moviesearcher.presentation.model.MovieModel
import io.vasilenko.otus.moviesearcher.presentation.view.MovieDetailsView
import kotlinx.android.synthetic.main.activity_movie_details.*

class MovieDetailsActivity : AppCompatActivity(), MovieDetailsView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        detailsBackButton.setOnClickListener { finish() }
        showMovie()
    }

    override fun showMovie() {
        val movie = intent.getParcelableExtra<MovieModel>("movie")
        movieDescription.text = movie?.description
        movieRating.text = movie?.rating
        Glide.with(this)
            .load(movie?.backdropPath)
            .placeholder(R.drawable.ic_movie_default)
            .fallback(R.drawable.ic_movie_default)
            .error(R.drawable.ic_movie_default)
            .into(movieImg)
    }
}