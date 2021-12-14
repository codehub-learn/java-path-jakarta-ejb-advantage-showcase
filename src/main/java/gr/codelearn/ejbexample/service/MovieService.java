package gr.codelearn.ejbexample.service;

import gr.codelearn.ejbexample.domain.Movie;

import java.util.List;

public interface MovieService {
    Movie create(Movie movie);
    Movie findById(Long id);
    List<Movie> findAll();
}
