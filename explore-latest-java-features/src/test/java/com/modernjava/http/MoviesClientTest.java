package com.modernjava.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//@Disabled
public class MoviesClientTest {

    MoviesClient moviesClient = new MoviesClient();

    @Test
    void getMoviesById() {
        var movie = moviesClient.getMovieByID();
        assertNotNull(movie);
        assertEquals("Batman Begins", movie.name());
    }

    @Test
    void getAllMovies() {
        var moviesList = moviesClient.getAllMovies();
        assert moviesList.size() == 10;
    }


    @Test
    void getMoviesByIdAsync() {
        var movie = moviesClient.getMovieByIDAsync().join();
        assertNotNull(movie);
        assertEquals("Batman Begins", movie.name());
    }
}
