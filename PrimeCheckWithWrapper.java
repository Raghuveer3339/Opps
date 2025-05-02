import java.util.ArrayList;

public class PrimeCheckWithWrapper {
    public static void main(String[] args) {
        // Autoboxing: adding int values to ArrayList<Integer>
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i); // autoboxing
        }

        // Iterate and check if each number is prime
        for (Integer num : numbers) {
            int value = num; // unboxing
            if (isPrime(value)) {
                System.out.println(value + " is a prime number.");
            } else {
                System.out.println(value + " is not a prime number.");
            }
        }
    }

    // Prime number checker
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
