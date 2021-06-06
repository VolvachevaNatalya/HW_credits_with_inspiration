package credits;

import java.util.Random;

public class RegularClerk extends Thread {

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

    public RegularClerk() {
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOfCredits; i++) {
            try {
                Thread.sleep(new Random().nextInt(maxTime-minTime) + minTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Clerk " + name + " issued " + numberOfCredits + " credits during " + (end-start) + "ms." );


    }
}
