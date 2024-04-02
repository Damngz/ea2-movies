package com.ea2.movies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ea2.movies.model.Movie;
import com.ea2.movies.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
  @Autowired
  private MovieRepository movieRepository;

  @Override
  public List<Movie> getAllMovies() {
    return movieRepository.findAll();
  }

  @Override
  public Optional<Movie> getMovieById(Long id) {
    return movieRepository.findById(id);
  }
}
