import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 , num2;
        System.out.println("Enter the number for addition");
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println(Sum(num1 , num2));
    }
    static int Sum(int a , int b){
        int sum ;
        sum = a + b;
        return sum;
    }
}
