import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A,B,C;
        System.out.print("Enter the numbers");
        A= in.nextInt();
        B= in.nextInt();
        C= in.nextInt();
        if(A>B){
            if (A>C){
                System.out.println(A+" A is largest number of all");
            }
            else {
                System.out.println(C+" C is largest number of all");
            }
        }else if(B>A) {
            if (B>C){
                System.out.println(B+" B is largest number of all");
            }
            else {
                System.out.println(C+" C is largest number of all");
            }
        }
    }
}
