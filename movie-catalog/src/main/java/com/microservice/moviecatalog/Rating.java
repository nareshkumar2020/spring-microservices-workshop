package com.microservice.moviecatalog;

public class Rating {

    private int movieId;
    private int userRating;

    public Rating() {
    }

    public Rating(int userRating) {
        this.userRating = userRating;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}
