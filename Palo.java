import java.util.Scanner;

public class Palo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input ;
        System.out.println("Enter the string");
        input = in.nextLine();
        pa(input);
    }
    static String pa(String str){
        int num = str.length();
        String New="";
        for (int i = num-1;i>=0;i--)New = New + str.charAt(i);
        if(str.equalsIgnoreCase(New)) System.out.println(str+" String is Palindrome");
        else System.out.println(str+"String is not Palindrome");
        return str;
    }
}
