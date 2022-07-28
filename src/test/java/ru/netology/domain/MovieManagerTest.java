package ru.netology.domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

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
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);

        Movies[] actual = manager.findAll();
        Movies[] expected = {first, second, third};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastwithParameterTest() {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);

        Movies[] actual = manager.findLast(2);
        Movies[] expected = {third, second};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastNoParameterTest1LessThan10() {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);

        Movies[] actual = manager.findLast();
        Movies[] expected = {third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastNoParameterTestLengthMoreThan10() {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        Movies[] actual = manager.findLast();
        Movies[] expected = {twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, forth, third};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastNoParameterTestLengthIs10() {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        Movies[] actual = manager.findLast();
        Movies[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, forth, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }
}
