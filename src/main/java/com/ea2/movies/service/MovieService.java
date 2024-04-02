package com.ea2.movies.service;

import java.util.List;
import java.util.Optional;

import com.ea2.movies.model.Movie;

public interface MovieService {
  List<Movie> getAllMovies();
  Optional<Movie> getMovieById(Long id);
}
