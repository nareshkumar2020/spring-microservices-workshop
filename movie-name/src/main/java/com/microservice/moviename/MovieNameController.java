package com.microservice.moviename;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-name")
public class MovieNameController {

    @RequestMapping("/test")
    public String testMovieController() {
        return "movie-name";
    }

    @RequestMapping("/getMovieDetails/{movieId}")
    public MovieDetails getMovieDetails(@PathVariable int movieId){
        return new MovieDetails(movieId,"Bahubali","Master piece",null);
    }
}
