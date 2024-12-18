import java.util.Scanner;

public class Lightbill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Previous light bill unit : ");
        float Pre = in.nextFloat();
        System.out.println("Enter the Current light bill unit : ");
        float Cur = in.nextFloat();
        System.out.println("Used unit in last month is" + (Cur - Pre));
        float Extra = 0;
        if ((Cur - Pre) > 100) {
            Extra = ((Cur - Pre) % 100);
        }
        System.out.println("Extra units is : " +Extra);
        float First = Cur - Pre - Extra;
        double Light_bill = First * 6;
        if (Extra > 0) Light_bill += (Extra * 30);
        System.out.println("Light bill without GST is: " +Light_bill);
        double Total = ((Light_bill * 18)/100) + Light_bill;
        System.out.println("Total light bill is "+Total);
            in.close();
    }
}
