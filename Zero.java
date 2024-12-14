import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Sum of integers until user put zero (0)
//        int Num  , Sum= 0 ;
//        System.out.println("Enter the numbers in string");
//        while (true){
//            Num = in.nextInt();
//            if (Num == 0) break;
//            Sum += Num;
//        }
//        System.out.println(Sum);

        //largest number until user put zero(0)
        int num , max = 0;
        System.out.println("Enter the numbers");
        while (true){
            num = in.nextInt();
            if (num == 0)break;
            if (max < num) max = num ;
        }
        System.out.println(max);
        in.close();
    }
}
