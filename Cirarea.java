import java.util.Scanner;

public class Cirarea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float r;
        System.out.println("enter the radius ");
        r = in.nextFloat();
        System.out.println(area(r));
        System.out.println(circumference(r));
    }
    static double area (float r){
        double area = r*r*3.14;
        return  area;
    }
    static double circumference (float r){
        double circumference = 3.14*r;
        return circumference;
    }
}
