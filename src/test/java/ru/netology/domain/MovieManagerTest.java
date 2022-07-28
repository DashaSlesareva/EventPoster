package ru.netology.domain;


import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    Movies first = new Movies(101, "Bloodshot", "https://www.yandex.ru/film/512673", "action", false);
    Movies second = new Movies(102, "Onward", "https://www.yandex.ru/film/567396", "cartoon", false);
    Movies third = new Movies(103, "OtelBelrad", "https://www.yandex.ru/film/675904", "comedy", false);
    Movies forth = new Movies(104, "TheGentelmen", "https://www.yandex.ru/film/775932", "action", false);
    Movies fifth = new Movies(105, "TheInvisibleMan","https://www.yandex.ru/film/123456", "horror", false);
    Movies sixth = new Movies(106, "TrollsWorldTour", "https://www.yandex.ru/film/907854", "cartoon", true);
    Movies seventh = new Movies(107, "NomerOdin", "https://www.yandex.ru/film/908986", "comedy", true);

    @Test
    public void addingTest () {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);




    }
}
