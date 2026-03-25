package Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Enum.LiteratureType;

import static org.junit.jupiter.api.Assertions.*;

class AudioBookTest {

    Title audioBook;

    @BeforeEach
    void setUp() {
        audioBook = new AudioBook("Test1", LiteratureType.LYRIK,300,60);
    }

    @Test
    void calculatePoints() {
        double actual = audioBook.calculatePoints();            // actual
        double expected = (60 * 0.5) * 6 * 300;                 // expected
        assertEquals(expected, actual);
    }
}