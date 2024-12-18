import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter the number :");
        num = in.nextInt();
        System.out.println(Factorial(num));
    }

    static int Factorial(int num) {
        int i = 1;
        int fact=0;
        int loop = num -1;
        while (loop >= i) {
            fact = num *i;
            System.out.println(i+"*"+num+"="+fact);
            num = fact;
            i++;
        }
        return fact;
    }
}