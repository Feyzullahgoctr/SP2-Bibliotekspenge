public enum LiteratureType {

    BI("Billedbøger",3),
    TE("Tegneserier",3),
    LYRIK("Lyriksamlinger",6),
    SKØN("Skønlitterære ",1.7),
    FAG("Fagbøger",1);

    private String type;
    private double value;

    LiteratureType(String type,double value) {
        this.type = type;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return type;
    }
}
