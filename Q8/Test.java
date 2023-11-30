package Q8;

class InvalidInputException extends Exception {
    public InvalidInputException(int number) {
        super("InvalidInputException [" + number + "]");
    }
}

class TestPrime {
    public boolean isPrime(int num) throws InvalidInputException {
        if (num <= 1) {
            throw new InvalidInputException(num);
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        TestPrime testPrime = new TestPrime();

        try {
            int inputNumber = 7; // Replace this with user input
            if (testPrime.isPrime(inputNumber)) {
                System.out.println(inputNumber + " is a prime number.");
            } else {
                System.out.println(inputNumber + " is not a prime number.");
            }
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
}
