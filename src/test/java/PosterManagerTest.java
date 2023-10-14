import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    Movie item1 = new Movie(1, "Бладшот", "боевик");
    Movie item2 = new Movie(2, "Вперед", "м/ф");
    Movie item3 = new Movie(3, "Отель Белград", "комедия");

    PosterManager manager = new PosterManager();

    @BeforeEach
    public void setup() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
    }

    @Test
    public void addNoMovies() {

        PosterManager manager = new PosterManager();

        manager.findAll();

        Movie[] expected = {};
        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneMovie() {

        Movie item4 = new Movie(4, "Джентльмены", "боевик");
        manager.add(item4);

        Movie[] expected = {item1, item2, item3, item4};
        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addSomeMovies() {

        Movie item4 = new Movie(4, "Джентльмены", "боевик");
        Movie item5 = new Movie(5, "Человек-невидимка", "ужасы");

        manager.add(item4);
        manager.add(item5);

        Movie[] expected = {item1, item2, item3, item4, item5};
        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllTest() {

        Movie[] expected = {item1, item2, item3};
        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {

        Movie[] expected = {item3, item2, item1};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestLimit2() {
        PosterManager manager = new PosterManager(2);
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);

        Movie[] expected = {item3, item2};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
