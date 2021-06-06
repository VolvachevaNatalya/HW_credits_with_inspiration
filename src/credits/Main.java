package credits;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        RegularClerk masha = new RegularClerk("Masha", 100, 200, 15);
        RegularClerk petya = new RegularClerk("Petya", 100, 300, 15);
        ClerkWithInspiration vasya = new ClerkWithInspiration("Vasya", 200, 300, 15, 50, 100);

        Thread th1 = new Thread(masha);
        Thread th2 = new Thread(petya);
        Thread th3 = new Thread(vasya);

        th1.start();
        th2.start();
        th3.start();
        th1.join();
        th2.join();
        th3.join();
    }
}