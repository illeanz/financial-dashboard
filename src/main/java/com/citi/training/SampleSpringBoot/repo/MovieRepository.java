package com.citi.training.SampleSpringBoot.repo;

import com.citi.training.SampleSpringBoot.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    Collection<Movie> findByTitle(String title);
}
