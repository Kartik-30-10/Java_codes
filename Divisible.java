import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ");
/*        int num1=in.nextInt();
        int sum=0, num2 = num1;
        while (num1>0){
            int temp = num1%10;
            sum+=temp;
            num1 = num1 /10;
        }
        if((sum % 3)==0) System.out.println("Number is "+num2+" divisible by 3 ");
        else System.out.println("Number is "+num2+" not divisible by 3");
 */
        String num=in.nextLine();
        int leng= num.length();
        int num1 = 0;
        int sum = 0;
        in.close();
    }
}
