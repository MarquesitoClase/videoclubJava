package org.example.view;

import org.example.controller.MovieController;
import org.example.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieView {
    Scanner scanner;
    private MovieController movieController;
    public MovieView(MovieController movieController){
        this.movieController = movieController;
    }

    public Movie generateMovie(){
        String[] directoresArray = new String[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el título de la película a añadir.");
        String title = scanner.nextLine();
        System.out.println("Escriba el año.");
        int anio = Integer.parseInt(scanner.nextLine());
            System.out.println("Escriba el director de la pelicula.");
            String director = scanner.nextLine();
            String cont="yes";
        ArrayList<String> actors = new ArrayList<>();
        while(!cont.equals("no")){
            System.out.println("Escribame el nombre de uno de sus actoresa/actrices.");
            actors.add(scanner.nextLine());
            System.out.println("Hay más actores?No para parar de introducirlos.");
        }

        System.out.println("Que puntaje tiene en filmAffinity? Psarte decimal con .");
        double filmScoree = (Double.parseDouble(scanner.nextLine()));

        System.out.println("De que va la película?.");
        String filmDescription = scanner.nextLine();

        System.out.println("Donde podemos encontrar su caratula?");
        String url = scanner.nextLine();

        System.out.println("Y, por último, donde se encuentra la web a esta película?");
        String description = scanner.nextLine();
        
        //public Movie(String title, int year, String director, String[] actors, int filmAffinittyScore, 
        //String filmDescription, String imgUrl, String url) {
        Movie ret = new Movie(title, anio, director,actors, filmScoree, filmDescription, url, description);
    }
}
