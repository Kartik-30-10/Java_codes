import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series of " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm; // Calculate next term
            firstTerm = secondTerm; // Update first term
            secondTerm = nextTerm; // Update second term
        }

        scanner.close();
    }
}
