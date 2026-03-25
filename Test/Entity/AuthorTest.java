package Entity;

import Model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Enum.*;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    Author author;
    double audioTest;
    double eAudioTest;
    double ebookTest;
    double printedBookTest;

    @BeforeEach
    void setUp() {
        author = new Author("Feyzullah");
        author.addTitle(new AudioBook("Alkymisten", LiteratureType.BI, 90,300));
        author.addTitle(new PrintedBook("Veronika vil dø", LiteratureType.LYRIK,200,300));
        author.addTitle(new EAudioBook("", LiteratureType.FAG,97,50,250,90));
        author.addTitle(new EBook("", LiteratureType.TE, 85, 45,150,15000, true));


        // Expected
        audioTest = (300 * 0.5) * 3 * 90;
        printedBookTest = 300 * 6 * 200;
        eAudioTest = (double)(90 / 2) * 1 * ((double)(50 * 5) + (double)(97 * 0.5) + 250) ;
        ebookTest = (((double) (15000 / 1800) + 20) * 3 * ((45 * 5) + (85 * 0.5) + 150)) * 1.1;


    }

    @Test
    void calculateRoyalties() {

        double actual = author.calculateRoyalties();
        double expected = (audioTest + printedBookTest + eAudioTest + ebookTest) * Title.RATE;
        assertEquals(expected, actual);
    }
}