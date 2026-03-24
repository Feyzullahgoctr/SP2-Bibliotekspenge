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
        return 0;
    }

    public int getUseFactor() {
        return 0;
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
