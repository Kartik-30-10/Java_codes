import java.util.Scanner;

public class AreVol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String srt1 , str2;
        System.out.println("Enter the option number ");
        System.out.println("1.Triangle\n2.Quadrilateral\n3.Circle\n4.Sphere");
        srt1 = in.nextLine();
        System.out.println("1.Area \n2.Circumference \n3.Volume");
        str2 = in.nextLine();
        int radius,height,width,length;
        Parameter(srt1,str2);
    }
    static void Parameter(String str1,String str2){
        Scanner in = new Scanner(System.in);
        int radius,height,width,lenght;
        switch (str1) {
            case "Triangle":
                switch (str2) {
                    case "Area":
                        System.out.println("Enter the height and base");
                        height = in.nextInt();
                        width = in.nextInt();
                        System.out.println("Area of Triangle is " + (height * width * 0.5));
                        break;
                    default:
                        System.out.println("Enter valid operation");
                }
            case "Quadrilateral":
                switch (str2) {
                    case "Area":
                        System.out.println("Enter the length and width");
                        lenght = in.nextInt();
                        width = in.nextInt();
                        System.out.println("Area of Quadrilateral is: " + (lenght * width));
                        break;
                    case "Volume":
                        System.out.println("Enter the height , width and length");
                        height = in.nextInt();
                        width = in.nextInt();
                        lenght = in.nextInt();
                        System.out.println("Volume of Quadrilateral is: " + (height * width * lenght));
                        break;
                }
            case "Circle":
                switch (str2) {
                    case "Circumference":
                        System.out.println("Enter the radius");
                        radius = in.nextInt();
                        System.out.println("Circumference of circle is: " + (radius * 3.14));
                        break;
                    case "Area":
                        System.out.println("Enter the radius ");
                        radius = in.nextInt();
                        System.out.println("Area of circle is: " + (Math.pow(radius, 2) * 3.14));
                        break;
                    default:
                        System.out.println("Enter valid operation");
                }
            case "Sphere":
                switch (str2) {
                    case "Circumference":
                        System.out.println("Enter the radius");
                        radius = in.nextInt();
                        System.out.println("Circumference of sphere is: " + (2 * 3.14 * radius));
                        break;
                    case "Area":
                        System.out.println("Enter radius");
                        radius = in.nextInt();
                        System.out.println("Area of sphere is: " + (2 * 3.14 * (Math.pow(radius, 2))));
                        break;
                    case "Volume":
                        System.out.println("Enter radius");
                        radius = in.nextInt();
                        System.out.println("Volume of sphere is: " + ((4 / 3) * 3.14 * (Math.pow(radius, 2))));
                        break;
                    default:
                        System.out.println("Enter the valid operation");
                }
            default:
                System.out.println("Enter valid operation");
        }
    }
}
