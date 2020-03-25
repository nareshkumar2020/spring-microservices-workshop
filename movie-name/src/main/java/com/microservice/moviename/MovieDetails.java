package com.microservice.moviename;

public class MovieDetails {

    private int movieId;
    private String movieName;
    private String movieDesc;
    private Rating rating;

    public MovieDetails(int movieId, String movieName, String movieDesc, Rating rating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDesc = movieDesc;
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

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
