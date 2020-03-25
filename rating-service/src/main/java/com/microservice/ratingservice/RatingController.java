package com.microservice.ratingservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating-service")
public class RatingController {

    @RequestMapping("/test")
    public String testRatingController(){
        return "Rating-Service";
    }

    @RequestMapping("/getRating/{movieId}")
    public Rating getRating(@PathVariable int movieId){
        return new Rating(movieId,3);
    }
}
