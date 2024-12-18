import java.util.Scanner;

public class PerCom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number for Permutation and Combination");
        int N,R;
        System.out.print("N:");
        N = in.nextInt();
        System.out.print("R:");
        R = in.nextInt();
        int factorial_N = 1;
        for (int i=1;i <= N ;i++){
            factorial_N *= i;
        }
        int factorial_NR = 1;
        for(int i=1;i<=(N-R);i++){
            factorial_NR *= i;
        }
        int factorial_R = 1;
        for (int i =1; i <=R ; i++){
            factorial_R *= i;
        }
        int Permutation = factorial_N / factorial_NR;
        int Combination = factorial_N / (factorial_R * factorial_NR);
        System.out.println("Permutaion is : "+Permutation+" and Combinatio is: "+Combination);
        in.close();
    }
}
