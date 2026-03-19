package org.example.view;

import org.example.controller.MovieController;
import org.example.model.Movie;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieView {
    private MovieController movieController;
    Scanner scanner=new Scanner(System.in);
    public MovieView(MovieController movieController){
        this.movieController = movieController;
    }

    public void createMovieView(){
        Movie movie = generateMovie();
        movieController.createMovieController((movie));
    }
    public Movie generateMovie(){
        scanner = new Scanner(System.in);

        System.out.println("Escriba el titulo de la película.");
        String title = scanner.nextLine();

        System.out.println("Escriba el año de la película.");
        int anio = Integer.parseInt(scanner.nextLine());

        System.out.println("Escriba su director.");
        String director = scanner.nextLine();

        System.out.println("Escriba sus actores, separados por ','");
        ArrayList<String> actores = new ArrayList();
        String actoresString = scanner.nextLine();

        ArrayList<String> actoresArray = new ArrayList<>();
        for (String actor : actoresString.split(",")) {
            actoresArray.add(actor.trim());
        }


        //double filmAffinittyScore, String filmDescription, String imgUrl, String url
        System.out.println("Que nota tiene en filmAffinitty? Decimales con .");
        double nota = Double.parseDouble(scanner.nextLine());

        System.out.println("De que vsa la peliculas segun filmAffinity?");
        String fAD = scanner.nextLine();

        System.out.println("Cual es la ruta a su imagen de portada?");
        String poster = scanner.nextLine();

        System.out.println("Donde se encuentra su pagina web?");
        String web = scanner.nextLine();


        return new Movie(title, anio, director, actores, nota,fAD, poster, web);
    }
}
