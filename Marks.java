import java.util.Scanner;

public class Marks
{
    public static void main(String[] args) {

        Marks();
    }
    static int Marks(){
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter the marks");
        num = in.nextInt();
        if (num<100 || num=>91) {
            System.out.println("AA");
        }
        if (num<90 || num=>81){
            System.out.println("AB");
        }
        if (num<80 || num=>71){
            System.out.println("BB");
        }
        if (num<70 || num=>61) {
            System.out.println("BC");
        }
        if (num<60 || num=>51) {
            System.out.println("CC");
        }
        if (num<40) System.out.println("Fail");
    }
}
