package ru.netology.domain;

public class MovieManager {
    private MovieRepository repo;

    private int limit;

    public MovieManager(int limit, MovieRepository repo) {
        this.limit = limit;
        this.repo = repo;
    }

    public MovieManager(MovieRepository repo) {
        this.limit = 10;
        this.repo = repo;
    }

    public void add(Movies movie) {
        repo.save(movie);
    }

    public Movies[] findLast() {
        Movies[] movies = repo.findAll();
        int outputAmount = limit;
        if (movies.length < limit) {
            outputAmount = movies.length;
        }
        Movies[] result = new Movies[outputAmount];
        for (int i = 0; i < outputAmount; i++) {
            result[i] = movies[movies.length - i - 1];
        }
        return result;
    }


    public Movies[] findAll() {
        return repo.findAll();
    }


}
