package Q9;

class FactorialThread extends Thread {
    private int number;

    public FactorialThread(int number) {
        this.number = number;
    }

    public void run() {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + ": " + factorial);
    }
}

class FactorsThread extends Thread {
    private int number;

    public FactorsThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.print("Factors of " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        int num = 10; // Change this number as needed

        FactorialThread factorialThread = new FactorialThread(num);
        FactorsThread factorsThread = new FactorsThread(num);

        factorialThread.start();
        factorsThread.start();

        try {
            factorialThread.join();
            factorsThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread finished.");
    }
}
