import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the X co-ordinates a1 and a2");
        int a1=0,b1=0,a2=0,b2=0;
        a1= in.nextInt();
        a2= in.nextInt();
        System.out.println("Enter the Y co-ordinates b1 and b2 ");
        b1= in.nextInt();
        b2= in.nextInt();
        double Distance = 0;
        double X_co= Math.pow(a1,2) - Math.pow(a2,2);
        double Y_co= Math.pow(b1,2) - Math.pow(b2,2);
        Distance = Math.sqrt(Math.abs(X_co+Y_co));
        System.out.println("Distance is :"+Distance);
        in.close();
    }
}
