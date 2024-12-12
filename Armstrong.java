import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many digit number you want: ");
        int Q = in.nextInt();
        System.out.println("Enter the number: ");
        int num = in.nextInt();

        int rem, num1;
        int result = 0;
        num1 = num;
        while (num1 > 0) {
            rem = num1 % 10;
            result += (int) Math.pow(rem, Q);
            num1 /= 10;
        }
        if (result == num) {
            System.out.println(num + " is Armstrong number");
        } else {
            System.out.println(num + " is not Armstrong number");
        }
    }
}
