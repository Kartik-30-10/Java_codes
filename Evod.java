import java.util.Scanner;
// This is for even or odd number
public class Evod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num= in.nextInt();
        if(num % 2 == 0){
            System.out.println("Given number is " + num +" even ");
        }
        else {
            System.out.println("Given number is " + num +" odd");
        }
    }
}