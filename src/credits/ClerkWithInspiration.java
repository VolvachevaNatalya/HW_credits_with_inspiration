package credits;

import java.util.Random;

public class ClerkWithInspiration extends RegularClerk {
    int inspMin;
    int inspMax;

    public ClerkWithInspiration(String name, int minTime, int maxTime, int numberOfCredits, int inspMin, int inspMax) {
        super(name, minTime, maxTime, numberOfCredits);
        this.inspMin = inspMin;
        this.inspMax = inspMax;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        int inspiredCredits = 0;

        for (int i = 0; i < numberOfCredits; i++) {
            int probability = (int) ((Math.random()) * 100);
            int CreditTime;
            if (probability < 20) {
                inspiredCredits = 3;

                for (int j = inspiredCredits; j > 0; j--) {
                    if (i < numberOfCredits) {
                        CreditTime = (new Random().nextInt(inspMax - inspMin) + inspMin);
                        i++;
                        try {
                            Thread.sleep(CreditTime);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } else {
                CreditTime = (new Random().nextInt(maxTime - minTime) + minTime);
                try {
                    Thread.sleep(CreditTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Clerk " + name + " issued " + numberOfCredits + " credits during " + (end - start) + "ms.");
    }
}

