package org.example.repository;


import org.example.config.DBManager;
import org.example.model.Movie;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MovieRepositoryImp {

    private Connection connection;


    public void createMovie(Movie movie){
        String querySQLCreate =
                "INSERT INTO films(title, year, director, actors, filmAffinittyScore, filmDescription, imgUrl, url, ranking) " +
                        "VALUES ('" + movie.getTitle() + "','"+ movie.getYear() + "','"+ movie.getDirector() + "','"
                        + movie.getActors() + "','"+ movie.getFilmAffinittyScore() + "','"+ movie.getFilmDescription() +
                        "','"+ movie.getImgUrl() + "','"+ movie.getUrl() +"')";
            try{
                connection = DBManager.innitConnection(); // conectar a la bbdd
                Statement statement = connection.createStatement(); // preparar la sentencia - Query
                statement.executeUpdate(querySQLCreate); // ejecutar la sentencia
                System.out.println("Evento Creado en la BBDD");

            } catch (Exception exception) {
                System.out.println(exception.getMessage());

            } finally {
                DBManager.closeConnection();
            }
        }
    }
