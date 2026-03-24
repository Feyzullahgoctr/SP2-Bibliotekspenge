public class EBook extends NetTitle {

    private int characters;
    private boolean illustrated;

    public EBook(String title, LiteratureType literatureType, int availability, int reach, int use, int characters, boolean illustrated) {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    @Override
    public double calculatePoints() {
        double ebookPoint = ((double)(characters / 1800 ) + 20) * literatureType.getValue() * ((getReach() * 5) + (getAvailability() * 0.5) + getUseFactor()) ;

        if (illustrated) {
            ebookPoint *= 1.1;
        }

        return ebookPoint;
    }


}
