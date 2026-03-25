package Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Enum.*;

import static org.junit.jupiter.api.Assertions.*;

class EAudioBookTest {

    EAudioBook eAudioBook;

    @BeforeEach
    void setUp() {
        eAudioBook = new EAudioBook("Test", LiteratureType.FAG,97,50,250,90);
    }

    @Test
    void calculatePoints() {
        double actaul = eAudioBook.calculatePoints();
        double expected = (double)(90 / 2) * 1 * ((double)(50 * 5) + (double)(97 * 0.5) + 250) ;

        assertEquals(expected, actaul);

    }
}