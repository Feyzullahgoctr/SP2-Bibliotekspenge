package Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Enum.*;

import static org.junit.jupiter.api.Assertions.*;

class PrintedBookTest {

    PrintedBook printedBook;

    @BeforeEach
    void setUp() {
        printedBook = new PrintedBook("", LiteratureType.TE, 250, 300);
    }

    @Test
    void calculatePoints() {
        double actual = printedBook.calculatePoints();
        double expected = 300 * 3 * 250;
        assertEquals(expected, actual);
    }
}