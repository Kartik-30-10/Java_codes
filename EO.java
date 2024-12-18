import java.util.Scanner;

public class EO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        EO(num);
    }
    static void EO(int num){
        if (num /2 == 0) System.out.println(num+ " is even");
        else System.out.println(num+" is odd");
    }
}
