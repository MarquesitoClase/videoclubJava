package org.example.model;

import java.util.ArrayList;

public class Movie {
    private Long id;
    private String title;
    private int year;
    private String director;
    private ArrayList<String>  actors;
    private double filmAffinityScore;
    private String filmDescription;
    private String imgUrl;

    public Movie(String title, int year, String director, ArrayList<String> actors, double filmAffinityScore, String filmDescription, String imgUrl, String url) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.actors = actors;
        this.filmAffinityScore = filmAffinityScore;
        this.filmDescription = filmDescription;
        this.imgUrl = imgUrl;
        Url = url;
    }

    String Url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String>  getActors() {
        return actors;
    }

    public void setActors(ArrayList<String>  actors) {
        this.actors = actors;
    }

    public double getFilmAffinittyScore() {
        return filmAffinityScore;
    }

    public void setFilmAffinittyScore(int filmAffinittyScore) {
        this.filmAffinityScore = filmAffinittyScore;
    }

    public String getFilmDescription() {
        return filmDescription;
    }

    public void setFilmDescription(String filmDescription) {
        this.filmDescription = filmDescription;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
