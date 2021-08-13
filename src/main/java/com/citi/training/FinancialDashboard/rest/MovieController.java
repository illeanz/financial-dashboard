package com.citi.training.FinancialDashboard.rest;

import com.citi.training.FinancialDashboard.entities.Movie;
import com.citi.training.FinancialDashboard.service.MovieService;
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
