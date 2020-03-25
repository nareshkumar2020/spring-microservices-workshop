package com.microservice.moviecatalog;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieDetailsService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallbackMovieDetails")
    public MovieDetails getMovieDetails(int id) {
        ResponseEntity<MovieDetails> movieDetails = restTemplate.getForEntity("http://Movie-Name/movie-name/getMovieDetails/" + id, MovieDetails.class);
        return movieDetails.getBody();
    }

    public MovieDetails getFallbackMovieDetails(int id) {
        return new MovieDetails();
    }

}
