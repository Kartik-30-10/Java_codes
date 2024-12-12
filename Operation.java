import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int O;
        float A,B;
        System.out.println("Choose the operation "+"\n"+"1.+(Addition)"+'\n'+"2.-(Subtraction)"+"\n"+"3.*(Multiplication)"+"\n"+"4./(Division)");
        System.out.print("Enter the operation number:");
        O = in.nextInt();
        System.out.print("Enetr the number A:");
        A = in.nextFloat();
        System.out.print("Enter the number B: ");
        B = in.nextFloat();
        if (O == 1){
            float Sum= A + B ;
            System.out.print("Sum of A: "+A+" & B: "+B+" is :"+Sum);
        } else if (O == 2) {
            if (A>B){
                float Sub = A - B ;
                System.out.print("Subtraction of A: "+A+" & B: "+B+" is :"+Sub);
            }else {
                float Sub= B - A;
                System.out.print("Subtraction of A: "+A+" & B: "+B+" is :"+Sub);
            }
        } else if (O == 3) {
            float Mul = A * B ;
            System.out.print("Multiplication of A: "+A+" & B: "+B+" is :"+Mul);
        } else if (O == 4) {
            float Div = A / B ;
            System.out.print("Division of A: "+A+" & B: "+B+" is :"+Div);
        }
    }
}
