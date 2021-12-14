package gr.codelearn.ejbexample.service.impl;

import gr.codelearn.ejbexample.domain.Movie;
import gr.codelearn.ejbexample.repository.MovieRepository;
import gr.codelearn.ejbexample.service.MovieService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class MovieServiceImpl implements MovieService {

    @EJB(beanName = "MovieRepository")
    private MovieRepository movieRepository;

    @Override
    public Movie create(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie findById(Long id) {
        return movieRepository.findById(id).orElse(new Movie());
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }
}
