package simpleprograms;
import java.util.Scanner;
abstract class abstEx {
    abstract void rectangle();
    abstract void circle();
}

public class abstExample extends abstEx{
    Scanner sc;
    public void rectangle(){
        sc=new Scanner(System.in);
        System.out.println("Enter the length");
        double l=sc.nextDouble();
        System.out.println("Enter the breadth");
        double b=sc.nextDouble();
        double area=l*b;
        System.out.println("The area pf rectangle is : " + area);

    }
    public void circle(){
        sc=new Scanner(System.in);
        System.out.println("Enter the area of circle");
        double r=sc.nextDouble();
        double area=Math.PI*r*r;
        System.out.println("The area of circle is : " + area);
    }
}

class Program{
    public static void main(String[] args) {
        abstExample ab=new abstExample();
        ab.rectangle();
        ab.circle();
    }
}
