package Service;

import Enum.LiteratureType;
import Model.*;
import Entity.*;

public class LibraryRoyaltyCalculator {

    public void main(String[] args) {

        // Opgave
        Author author = new Author("Paulo Coelho");

        author.addTitle(new AudioBook("Alkymisten", LiteratureType.BI, 90,300));
        author.addTitle(new PrintedBook("Veronika vil dø", LiteratureType.LYRIK,200,300));
        author.addTitle(new PrintedBook("Elleve minutter", LiteratureType.SKØN,150,400));

        System.out.println("Opgave ==> "+ author.getName() + " : " + author.calculateRoyalties() + " kr");


        // Frivillige Opgave
        author.addTitle(new EAudioBook("", LiteratureType.FAG,97,50,250,90));
        author.addTitle(new EBook("", LiteratureType.TE, 85, 45,150,15000, true));
        author.addTitle(new EBook("", LiteratureType.LYRIK, 40, 20,150,300000, false));
        System.out.println("Frivillige Opgave ==> "+ author.getName() + " : " + author.calculateRoyalties() + " kr");


    }


}
