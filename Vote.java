import java.util.Scanner;

public class Vote {
    public static  void main(String[] args){
        Vote();
    }
    static  void Vote(){
        Scanner in = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter the name and age ");
        name = in.nextLine();
        age = in.nextInt();
        if(age >= 18 ) System.out.println(name+" Valid for voting");
        else System.out.println( name+" Not valid for voting .After "+(18-age)+" years can be valid");
    }
}