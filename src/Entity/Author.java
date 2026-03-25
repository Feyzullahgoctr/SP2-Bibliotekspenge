package Entity;

import Model.*;
import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private List<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public double calculateRoyalties() {
        double totalPrice = 0;
        for (Title t : titles) {
            totalPrice += t.calculatePoints() * Title.RATE;
        }

        return totalPrice;
    }

    public String getName() {
        return name;
    }
}
