import java.util.Scanner;

public class Marks
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter the marks");
        num = in.nextInt();
        Marks(num);
    }
    static int Marks( int num){
        switch (num / 10) {
            case 10, 9:
                System.out.println("AA");
                break;
            case 8:
                System.out.println("AB");
                break;
            case 7:
                System.out.println("BB");
                break;
            case 6:
                System.out.println("BC");
                break;
            case 5:
                System.out.println("CD");
                break;
            case 4:
                System.out.println("DD");
                break;
            case 3, 2, 1:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Enter vaild marks");
        }
        return num;
    }
}
