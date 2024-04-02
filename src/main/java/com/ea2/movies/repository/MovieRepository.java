package com.ea2.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ea2.movies.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
