package com.microservice.moviecatalog;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie-catalog")
@RefreshScope
public class MovieCatalogController {

    @Value("${message:Default}")
    private String message;

    @Autowired
    MovieDetailsService movieDetailsService;

    @Autowired
    RatingService ratingService;

    @RequestMapping("/test")
    public String testMovieCatalogService() {
        return "Movie-Catalog-Service";
    }

    @RequestMapping("/get-property-from-cloud-config")
    public String getPropertyFromCloudConfig() {
        return message;
    }

    @RequestMapping("/{id}")
//    @HystrixCommand(fallbackMethod = "getFallbackMovieCatalog")
    public MovieCatalog getMovieCatalog(@PathVariable int id) {
        MovieCatalog movieCatalog = new MovieCatalog();

        MovieDetails movieDetails = movieDetailsService.getMovieDetails(id);
        Rating rating = ratingService.getRatingDetails(id);

        movieDetails.setRating(rating);

        List<MovieDetails> movieList = new ArrayList<>();
        movieList.add(movieDetails);
        movieCatalog.setMovieName(movieList);
        return movieCatalog;
    }

//    public MovieCatalog getFallbackMovieCatalog(@PathVariable int id) {
//        return new MovieCatalog();
//    }
}
