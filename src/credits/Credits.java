package credits;

import java.util.Random;

public class Credits implements Runnable{
    private RegularClerk regularClerk;

    public Credits(RegularClerk regularClerk) {
        this.regularClerk = regularClerk;
    }

    @Override
    public void run() {
        int totalTime = 0;
        for (int i = 0; i < regularClerk.numberOfCredits; i++) {
            long start = System.currentTimeMillis();

            try {
                Thread.sleep(new Random().nextInt(regularClerk.maxTime-regularClerk.minTime) + regularClerk.minTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long end = System.currentTimeMillis();
            totalTime += (end-start);

        }
        System.out.println("Clerk " + regularClerk.getName() + " issued " + regularClerk.numberOfCredits + " credits during " + totalTime + "ms." );

    }
}
