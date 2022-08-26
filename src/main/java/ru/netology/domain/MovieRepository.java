package ru.netology.domain;

public class MovieRepository {

    private Movies[] movies = new Movies[0];

    public void save(Movies newMovie) {
        Movies[] tmp = new Movies[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }

    public Movies[] findAll() {
        return movies;
    }

    public Movies findById(int id) {
        for (Movies movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    public void removeById(int id) {
        int length = movies.length - 1;
        Movies[] tmp = new Movies[length];
        int index = 0;
        for (Movies movie : movies) {
            if (movie.getId() != id) {
                tmp[index] = movie;
                index++;
            }
        }
        movies = tmp;
    }

    public void removeAll() {
        Movies[] tmp = new Movies[0];
        movies = tmp;

    }
}
