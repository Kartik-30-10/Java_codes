import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int num1= num;
        String  nu = String.valueOf(num);
        int l =nu.length();
        int sum1 = 0 ,sunm2= 0;
        for(int i =1 ;i<=l;i++){
            int temp = num % 10;
            num = num /10;
            if (i % 2 == 0){
                sum1 += temp;
            } else{
                sunm2 += temp;
            }
        }
        int temp = sum1 - sunm2;
        if (((Math.abs(temp) % 11) == 0) || (temp == 0)) {
            System.out.println(num1+" Number is  divisible by 11" );
        } else System.out.println(num1+" Number is not divisible by 11");
        in.close();
    }
}
