package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Movie;
import com.citi.training.FinancialDashboard.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Collection<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

}
