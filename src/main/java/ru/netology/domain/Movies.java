package ru.netology.domain;

public class Movies {
    private int id;
    private String title;
    private String pictureURL;
    private String genre;
    private boolean isPremiereTomorrow;

    public Movies() {
    }

    public Movies(int id, String title, String pictureURL, String genre, boolean isPremiereTomorrow) {
        this.id = id;
        this.title = title;
        this.pictureURL = pictureURL;
        this.genre = genre;
        this.isPremiereTomorrow = isPremiereTomorrow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isPremiereTomorrow() {
        return isPremiereTomorrow;
    }

    public void setPremiereTomorrow(boolean premiereTomorrow) {
        isPremiereTomorrow = premiereTomorrow;
    }
}

