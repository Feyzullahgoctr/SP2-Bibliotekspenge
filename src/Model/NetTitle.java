package Model;

import Enum.LiteratureType;

public abstract class NetTitle extends Title {

    private int availability;
    private int reach;
    private int use;

    public NetTitle(String title, LiteratureType literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    public double getPseudoCopies() {
        return (reach * 5) + (availability * 0.5) + use;
    }

    public int getAvailability() {
        return availability;
    }

    public int getUse() {
        return use;
    }

    public int getReach() {
        return reach;
    }
}
