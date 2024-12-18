import java.util.Scanner;

public class LGcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  the numbers for LCM and GCD ");
        int a,b;
        System.out.print("a= ");
        a = in.nextInt();
        System.out.print("b= ");
        b = in.nextInt();
        int gcd = a;
        int tempb = b;
        while (tempb !=  0){
            int reminder = gcd % tempb ;
            gcd = tempb;
            tempb = reminder;
        }
        int lcm = Math.abs(a*b/gcd);
        System.out.println("GCD of a: "+a+" and b: "+b+" is equal to "+gcd);
        System.out.println("LCM of a: "+a+" and b: "+b+" is equal to "+lcm);
        in.close();
    }
}
