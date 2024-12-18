import java.util.Scanner;

public class FunMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =0,b=0,c=0;
        System.out.print("Enter the numbers a and b : ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        max(a,b,c);
    }
    static  void max( int num1, int num2 ,int num3) {
        if (num1>num2) {
            if (num1>num3)System.out.println(num1+" is greater");
            else System.out.println(num3+" is greatest");
        }
        if (num2>num1){
            if (num2>num3){
                System.out.println(num2+" is greater");
            }else System.out.println(num3+" is greater");
        }
    }
}
