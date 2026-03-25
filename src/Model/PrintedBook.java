package Model;

import Enum.LiteratureType;

public class PrintedBook extends PhysicalTitle {

    private int pages;

    public PrintedBook(String title, LiteratureType literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    public double calculatePoints() {
        return pages * convertLiteratureType() * getCopies();
    }
}
