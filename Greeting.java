import java.util.Scanner;
// Code for Greeting
public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name :");
        String name = in.next();
        System.out.println("Hello ! Welcome to Java " + name);
    }
}
