package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    Collection<Movie> findByTitle(String title);
}
