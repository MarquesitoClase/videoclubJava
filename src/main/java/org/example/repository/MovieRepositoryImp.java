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
                "SELECT * from films";
            try{
                connection = DBManager.innitConnection(); // conectar a la bbdd
                Statement statement = connection.createStatement(); // preparar la sentencia - Query
                System.out.println(statement.executeQuery(querySQLCreate)); // ejecutar la sentencia
                System.out.println("Pelicula Creado en la BBDD");

            } catch (Exception exception) {
                System.out.println(exception.getMessage());

            } finally {
                DBManager.closeConnection();
            }
        }
    }
