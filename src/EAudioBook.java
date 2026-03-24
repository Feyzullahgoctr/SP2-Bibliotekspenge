public class EAudioBook extends NetTitle implements IAudioBook {

    private int durationInMinutes;

    public EAudioBook(String title, LiteratureType literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public double calculatePoints() {
        double eAudioPoint = (double)(durationInMinutes / 2) * literatureType.getValue() * ((getReach() * 5) + (getAvailability() * 0.5) + getUseFactor()) ;

        return eAudioPoint;
    }

    @Override
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
