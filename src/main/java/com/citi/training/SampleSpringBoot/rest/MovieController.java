package com.citi.training.SampleSpringBoot.rest;

import com.citi.training.SampleSpringBoot.entities.Movie;
import com.citi.training.SampleSpringBoot.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;


    @GetMapping
    public Collection<Movie> getMovies() {
        return movieService.getAllMovies();
    }



}
