public class SimpleThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread counterThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Counter1: " + i);
            }
        });

        Thread counter2Thread = new Thread(() -> {
            for (int i = 10; i <= 20; i++) {
                System.out.println("Counter2: " + i);
            }
        });

        Thread rainbowThread = new Thread(() -> {
            String[] colors = { "Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet" };
            for (int i = 0; i <= 2; i++) {
                for (String color : colors) {
                    System.out.println("Color: " + color);
                }
            }
        });

        counterThread.start();
        counter2Thread.start();
        rainbowThread.start();

        System.out.println("done!");
    }
}