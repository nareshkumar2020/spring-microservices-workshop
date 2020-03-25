package com.microservice.moviecatalog;

import java.util.List;

public class MovieDetails {

    private int movieId;
    private String movieName;
    private Rating rating;

    public MovieDetails() {
    }

    public MovieDetails(int movieId, String movieName, Rating rating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.rating = rating;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }


}
