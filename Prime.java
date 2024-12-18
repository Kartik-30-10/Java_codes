import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num ;
        System.out.println("enter the number");
        num = in.nextInt();
        boolean ans = Prime(num);
        System.out.println(ans);
    }
    static boolean Prime(int num){
        if (num <=1){
            return  false;
        }
        int a=2;
        while (a*a<=num){
            if (num % a == 0){
                return false;
            }
            a++;
        }
        return a*a > num;
    }
}
