package com.citi.training.SampleSpringBoot.service;

import com.citi.training.SampleSpringBoot.entities.Movie;

import java.util.Collection;

public interface MovieService {
    Collection<Movie> getAllMovies();
}
