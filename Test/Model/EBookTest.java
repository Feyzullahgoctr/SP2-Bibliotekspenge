package Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Enum.*;

import static org.junit.jupiter.api.Assertions.*;

class EBookTest {

    EBook eBookTest1;
    EBook eBookTest2;

    @BeforeEach
    void setUp() {
        eBookTest1 = new EBook("", LiteratureType.SKØN, 90, 50, 25, 360000, true);
        eBookTest2 = new EBook("", LiteratureType.SKØN, 90, 50, 25, 360000, false);
    }

    @Test
    void calculatePoints() {

        // Test1
        double actual = eBookTest1.calculatePoints();
        double expected = (((double) (360000 / 1800) + 20) * 1.7 * ((50 * 5) + (90 * 0.5) + 25)) * 1.1;
        assertEquals(expected,actual);

        // Test2
        double actual2 = eBookTest2.calculatePoints();
        double expected2 = (((double) (360000 / 1800) + 20) * 1.7 * ((50 * 5) + (90 * 0.5) + 25));
        assertEquals(expected2,actual2);

    }
}