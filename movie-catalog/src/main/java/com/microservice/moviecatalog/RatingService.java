package com.microservice.moviecatalog;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RatingService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallbackRatingDetails", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
//            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliSeconds", value = "5000")
    })
    public Rating getRatingDetails(int id) {
        ResponseEntity<Rating> rating = restTemplate.getForEntity("http://Rating-Service/rating-service/getRating/" + id, Rating.class);
        return rating.getBody();
    }

    public Rating getFallbackRatingDetails(int id) {
        return new Rating();
    }


}
