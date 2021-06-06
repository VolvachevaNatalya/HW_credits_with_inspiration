package credits;

public class RegularClerk {

    String name;
    int minTime;
    int maxTime;
    int numberOfCredits;

    public RegularClerk(String name, int minTime, int maxTime, int numberOfCredits) {
        this.name = name;
        this.minTime = minTime;
        this.maxTime = maxTime;
        this.numberOfCredits = numberOfCredits;
    }

    public String getName() {
        return name;
    }

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }
}
