import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int O;
        float Con,R,D;
        System.out.println("1.Dollar to Rupees \n2.Rupees to Dollar ");
        System.out.print("Enter the option number: ");
        O = in.nextInt();
        if(O == 1){
            System.out.print("Enter the Dollars:");
            D = in.nextFloat();
            Con = 85*D;
            System.out.println("Total rupees can be:"+Con);
        }else {
            System.out.print("Enter the Rupees:");
            R = in.nextFloat();
            Con = R/85;
            System.out.println("Total Dollars can be"+Con);
        }
    }
}
