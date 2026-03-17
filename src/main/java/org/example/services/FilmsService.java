package org.example.services;


import org.example.config.DBManager;
import org.example.model.Movie;
import org.example.repository.MovieRepositoryImp;

import static org.example.config.DBManager.innitConnection;

public class FilmsService {
    MovieRepositoryImp reposotory = new MovieRepositoryImp();
    public boolean add(Movie movie){
        boolean added=false;
        DBManager.innitConnection();
        if (!reposotory.findAll().contains(movie)) {
            reposotory.save(movie);
            added = true;
        }
        DBManager.closeConnection();
        return added;
    }
}
