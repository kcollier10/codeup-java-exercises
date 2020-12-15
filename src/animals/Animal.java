package animals;

public class Animal {

    private final int numberOfLegs;
    private final String preferredClimate;

    public String getAnimalInfo() {
        return numberOfLegs + preferredClimate;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getPreferredClimate() {
        return preferredClimate;
    }

    public int setNumberOfLegs() {
        return numberOfLegs;
    }

    public String setPreferredClimate() {
        return preferredClimate;
    }

    public Animal(int numberOfLegs, String preferredClimate) {
        this.numberOfLegs = numberOfLegs;
        this.preferredClimate = preferredClimate;
    }
}
