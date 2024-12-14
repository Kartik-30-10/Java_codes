import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num , i;
        System.out.println("Enter the number :");
        num = in.nextInt();
        for (i=1;i<=num ; i++){
            if(num % i == 0){
                int fact = num / i;
                System.out.println(fact);}
        }
    }
}
