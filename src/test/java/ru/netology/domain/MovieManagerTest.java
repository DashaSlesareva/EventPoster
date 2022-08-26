package ru.netology.domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

public class MovieManagerTest {
    private MovieRepository repo = Mockito.mock(MovieRepository.class);
    Movies first = new Movies(101, "Bloodshot", "https://www.yandex.ru/film/512673", "action", false);
    Movies second = new Movies(102, "Onward", "https://www.yandex.ru/film/567396", "cartoon", false);
    Movies third = new Movies(103, "OtelBelrad", "https://www.yandex.ru/film/675904", "comedy", false);
    Movies forth = new Movies(104, "TheGentelmen", "https://www.yandex.ru/film/775932", "action", false);
    Movies fifth = new Movies(105, "TheInvisibleMan", "https://www.yandex.ru/film/123456", "horror", false);
    Movies sixth = new Movies(106, "TrollsWorldTour", "https://www.yandex.ru/film/907854", "cartoon", true);
    Movies seventh = new Movies(107, "NomerOdin", "https://www.yandex.ru/film/908986", "comedy", true);
    Movies eighth = new Movies(108, "NomerOdin", "https://www.yandex.ru/film/908986", "comedy", true);
    Movies ninth = new Movies(109, "NomerOdin", "https://www.yandex.ru/film/908986", "comedy", true);
    Movies tenth = new Movies(110, "NomerOdin", "https://www.yandex.ru/film/908986", "comedy", true);
    Movies eleventh = new Movies(111, "NomerOdin", "https://www.yandex.ru/film/908986", "comedy", true);
    Movies twelfth = new Movies(112, "NomerOdin", "https://www.yandex.ru/film/908986", "comedy", true);


    @Test
    public void findAllTest() {
        Movies[] returned = {first, second, third};
        doReturn(returned).when(repo).findAll();
        MovieManager manager = new MovieManager(repo);
        Movies[] actual = manager.findAll();
        Movies[] expected = {first, second, third};
        Assertions.assertArrayEquals(expected, actual);
        verify(repo).findAll();
    }

    @Test
    public void findLastwithParameterTest() {
        Movies[] returned = {first, second, third};
        doReturn(returned).when(repo).findAll();
        MovieManager manager = new MovieManager(2, repo);
        Movies[] actual = manager.findLast();
        Movies[] expected = {third, second};
        Assertions.assertArrayEquals(expected, actual);
        verify(repo).findAll();
    }
}
