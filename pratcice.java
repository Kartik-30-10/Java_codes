import java.util.Scanner;

public class pratcice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= in.nextInt();
        System.out.println(sum(num));
    }
    static int sum(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
}