package com.microservice.moviecatalog;

import java.util.List;

public class MovieCatalog {

    private List<MovieDetails> movieName;

    public List<MovieDetails> getMovieName() {
        return movieName;
    }

    public void setMovieName(List<MovieDetails> movieName) {
        this.movieName = movieName;
    }
}
