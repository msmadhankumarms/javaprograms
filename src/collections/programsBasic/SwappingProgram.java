package collections.programsBasic;
import java.util.Scanner;

class temp{
   static void tempaorary(){
        Scanner sc=new Scanner(System.in);
       System.out.println("**** Swapping Using Third variable ****");
       System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B");
        int b=sc.nextInt();
        //Logic by using third variable
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After Swapping of A and B is : " + a +" "+ b);
    }

    static void without_third(){
        Scanner sc=new Scanner(System.in);
        System.out.println("**** Swapping Using Without Third Variable ****");
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B");
        int b=sc.nextInt();
        //Logic by using third variable
        a = a + b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping of A and B is : " + a +" "+ b);
    }

    static void usingBitwise(){
        Scanner sc=new Scanner(System.in);
        System.out.println("**** Swapping Using Bitwise ****");
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B");
        int b=sc.nextInt();
        //Logic by using Bitwise operator
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping of A and B is : " + a +" "+ b);
    }
}

public class SwappingProgram {
    public static void main(String[] args) {
       temp.tempaorary();
       temp.without_third();
       temp.usingBitwise();

    }
}

