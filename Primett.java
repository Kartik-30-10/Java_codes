import java.util.Scanner;

public class Primett {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check if it's prime:");
        int num = in.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
        in.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false; // Handle special cases
        if (n == 2) return true; // The only even prime number
        if (n % 2 == 0) return false; // Exclude even numbers

        // Check odd factors from 3 to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false; // Found a divisor
        }
        return true; // No divisors found, it's prime
    }
}
