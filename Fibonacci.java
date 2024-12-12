import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = 0 , B = 1 ;
        System.out.println("Enter the number for fibonacci series: ");
        int n = in.nextInt();
        for (int i=1;i<=n;i++){
            System.out.print(A+" ");
            int Z = A + B ;
            A = B ;
            B = Z ;
        }
    }
}
