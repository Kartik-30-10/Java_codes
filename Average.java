import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers for average :");
        int  num1,cout =0 , i=1 ;
        float Sum = 0;
        while (true){
            num1= in.nextInt();
            if(num1 == 0 )break;
            cout = i++;
            Sum += num1;
        }
        System.out.println("Average is :"+(Sum/cout));
    }
}
