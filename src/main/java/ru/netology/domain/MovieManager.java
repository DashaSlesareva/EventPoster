package ru.netology.domain;

public class MovieManager {

    private Movies[] movies = new Movies[0];

    public void add (Movies movie) {
        int length = movies.length + 1;

        Movies[] tmp = new Movies [length];
        for (int i = 0; i<movies.length; i++){
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }
}
