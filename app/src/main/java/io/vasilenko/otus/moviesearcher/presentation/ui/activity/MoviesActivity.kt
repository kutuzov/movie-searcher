package io.vasilenko.otus.moviesearcher.presentation.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import io.vasilenko.otus.moviesearcher.presentation.navigation.MoviesRouterHandler
import io.vasilenko.otus.moviesearcher.presentation.view.MoviesView

class MoviesActivity : AppCompatActivity(), MoviesView, MoviesRouterHandler {

    override fun showTopMovies() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showFavoriteMovies() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onOpenActivity(intent: Intent) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onOpenFragment(fragment: Fragment, addToBackStack: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}