import java.util.Scanner;

public class PandS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int Num = in.nextInt();
        int Rem , New ,Sum=0 , Pro=1 ;
        while (Num >0){
            Rem = Num % 10;
            New = Num / 10;
            Num = New;
            Sum += Rem;
            Pro *= Rem;
        }
        System.out.println("Subtraction of Product "+Pro+" and sum "+Sum+" is : "+(Pro - Sum));
        in.close();
    }
}
