package Model;

import Enum.LiteratureType;
import Interface.IAudioBook;

public class AudioBook extends PhysicalTitle implements IAudioBook {

    private int durationInMinutes;

    public AudioBook(String title, LiteratureType literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public double calculatePoints() {
        return (durationInMinutes * 0.5) * convertLiteratureType() * getCopies()  ;
    }

    @Override
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}

