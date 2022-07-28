package ru.netology.domain;

public class MovieManager {

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
        int length;
        if (movies.length > 10) {
            length = 10;
        } else length = movies.length;
        Movies[] result = new Movies[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - i - 1];
        }
        return result;
    }

    public Movies[] findLast(int length) {
        if (movies.length < length) {
            length = movies.length;
        }
        Movies[] result = new Movies[length];
        for (int i = 0; i < length; i++) {
            result[i] = movies[movies.length - i - 1];
        }
        return result;
    }


    public Movies[] findAll() {
        return movies;
    }


}
