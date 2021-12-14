package gr.codelearn.ejbexample.repository;

import gr.codelearn.ejbexample.domain.Movie;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Stateless
public class MovieRepository implements Repository<Movie,Long>{

    @PersistenceContext(unitName = "aDatabase")
    private EntityManager entityManager;

    @Override
    public Movie save(Movie movie) {
        entityManager.persist(movie);
        return movie;
    }

    @Override
    public Optional<Movie> findById(Long aLong) {
        return Optional.ofNullable(entityManager.find(Movie.class,aLong));
    }

    @Override
    public List<Movie> findAll() {
        return entityManager.createQuery("SELECT m FROM Movie m").getResultList();
    }
}
