import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float raduis,height,base;
        double volume = 0;
        float pai = 3.14F;
        float val= 0.333_333F;

         // volume of cone
//        System.out.println("Enter the volume radius and height of cone :");
//        raduis = in.nextFloat();
//        height = in.nextFloat();
//        volume = val * pai * height * Math.pow(raduis,2);
//        System.out.println("Volume of Cone is :"+volume);

        // volume of prism
//        System.out.println("Enter height and base :");
//        height = in.nextFloat();
//        base = in.nextFloat();
//        volume = height * base ;
//        System.out.println("Volume of Prism is :" +volume);

        // volume of cylinder
//        System.out.println("Enter the radius and height of cylinder:");
//        raduis = in.nextFloat();
//        height = in.nextFloat();
//        volume = pai * Math.pow(raduis,2) * height;
//        System.out.println("Volume of cylinder is : "+volume);

        // volume of sphere
//        System.out.println("Enter the radius of sphere :");
//        raduis = in.nextFloat();
//        volume = (4.0/3.0) * pai * Math.pow(raduis,3);
//        System.out.println("Volume of sphere is : " +volume);

        //volume of pyramid
        System.out.println("Enter the length of base , width of base and height :");
        base = in.nextFloat();
        raduis = in.nextFloat();
        height = in.nextFloat();
        volume = (4.0 / 3) * base * raduis * height;
        System.out.println("Volume of pyramid is : " +volume);

        in.close();
    }
}
