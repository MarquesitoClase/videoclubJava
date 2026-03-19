package org.example;

import org.example.config.DBManager;
import org.example.controller.MovieController;
import org.example.model.Movie;
import org.example.repository.MovieRepositoryImp;
import org.example.view.MovieView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MovieRepositoryImp movieRepository = new MovieRepositoryImp();
        MovieController movieController = new MovieController((movieRepository));
        MovieView movieView = new MovieView(movieController);
        movieView.createMovieView();
    }
}