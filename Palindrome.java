import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String revword="" ;
        int N,i;
        System.out.println("Enter the word for checking og Palindrome: ");
        String word = in.next();
        N=word.length();
        for(i=N-1;i>=0;i--) revword = revword + word.charAt(i);
        if (word.equalsIgnoreCase(revword)) System.out.println(word+" is Palindrome String");
        else System.out.println(word+" is not Palindrome String");
    }
}
