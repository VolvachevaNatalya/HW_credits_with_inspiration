package credits;

public class Main {
    private static final int MIN_TIME = 100;
    private static final int CREDITS_NUM = 15;
    public static void main(String[] args) throws InterruptedException {
        RegularClerk masha = new RegularClerk("Masha", MIN_TIME, 200, CREDITS_NUM);
        RegularClerk petya = new RegularClerk("Petya", MIN_TIME, 300, CREDITS_NUM);

        Thread th1 = new Thread(new Credits(masha));
        Thread th2 = new Thread(new Credits(petya));

        th1.start();
        th2.start();
        th1.join();
        th2.join();

    }
}


//
//    Маша выдает 1 кредит от 100мсдо200мс,
//    Петявыдает 1 кредит от 200мсдо 300мс.
//    Васявыдает 1 кредит от 200мсдо 300мс безвдохновения,
//    свдохновениемон выдает 3 кредита подряд
//    со скоростьюот 50мсдо 100 мс.
//    Вдохновениеприходитс вероятностью 20%.
//    Узнать за какое время каждыйработниквыдаст 15кредитов