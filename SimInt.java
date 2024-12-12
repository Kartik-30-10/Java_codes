import java.util.Scanner;

public class SimInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float Total,P,R,T,Sim;
        System.out.print("Enter the principal :");
        P = in.nextFloat();
        System.out.print("Enter the rate of interest :");
        R = in.nextFloat();
        System.out.print("Enter the time :");
        T = in.nextFloat();
        Sim = ((P*R*T)/100);
        Total = Sim + P;
        System.out.println("Simple Interest on Principal " +P+ " is " +Sim);
        System.out.println("Total amount is "+Total);
    }
}
