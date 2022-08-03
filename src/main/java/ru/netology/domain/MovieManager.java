package ru.netology.domain;

public class MovieManager {

    private int limit;

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public MovieManager() {
        this.limit = 10;
    }

    private Movies[] movies = new Movies[0];

    public void add(Movies movie) {
        int length = movies.length + 1;

        Movies[] tmp = new Movies[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movies[] findLast() {
        if (movies.length < limit) {
            limit = movies.length;
        }
        Movies[] result = new Movies[limit];
        for (int i = 0; i < limit; i++) {
            result[i] = movies[movies.length - i - 1];
        }
        return result;
    }


    public Movies[] findAll() {
        return movies;
    }


}
