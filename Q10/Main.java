package Q10;

class CounterThread extends Thread {
    private static int counter = 0;

    public void run() {
        while (counter < 10) {
            System.out.println(Thread.currentThread().getName() + ": Counter value - " + counter++);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CounterThread highPriorityThread = new CounterThread();
        CounterThread lowPriorityThread = new CounterThread();
        CounterThread normalPriorityThread = new CounterThread();

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        highPriorityThread.setName("HighPriorityThread");
        lowPriorityThread.setName("LowPriorityThread");
        normalPriorityThread.setName("NormalPriorityThread");

        highPriorityThread.start();
        lowPriorityThread.start();
        normalPriorityThread.start();

        try {
            highPriorityThread.join();
            lowPriorityThread.join();
            normalPriorityThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread finished.");
    }
}
