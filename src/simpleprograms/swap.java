package simpleprograms;
import java.util.Scanner;
public class swap {
    Scanner sc= new Scanner(System.in);
    public int num1;
    public int num2;
    public void swaper(){
        System.out.println("For Method 1 using temp ");
        System.out.println("Enter the value 1");
        num1=sc.nextInt();
        System.out.println("Enter the value 2");
        num2=sc.nextInt();
        System.out.println("Before swapping : " + num1 + " " + num2);
        //method 1
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping num1 and num2 is : " + num1 +" " + num2);
    }

    public void method2(){
        System.out.println("For Method 2 without  using temp ");
        System.out.println("Enter the value 1");
        num1=sc.nextInt();
        System.out.println("Enter the value 2");
        num2=sc.nextInt();
        //method 2
        num1=num1+num2; //30
        num2=num1-num2;
        num1=num1 - num2;
        System.out.println("After Swapping num1 and num2 is : " + num1 +" " + num2);

    }

    public void method3(){
        System.out.println("For Method 3 using Bitwise OR ");
        System.out.println("Enter the value 1");
        num1=sc.nextInt();
        System.out.println("Enter the value 2");
        num2=sc.nextInt();
        //method 3
        num1= num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("After Swapping num1 and num2 is : " + num1 +" " + num2);
    }
}
