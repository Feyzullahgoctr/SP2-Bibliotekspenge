
public abstract class Title {

    private String title;
    LiteratureType literatureType;
    static final double RATE = 0.067574;

    public Title(String title, LiteratureType literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public abstract double calculatePoints();

    public double calculateRoyalty() {
        return 0;
    }

    public double convertLiteratureType() {
        return 0;
    }

}
