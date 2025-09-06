package simpleprograms;
import java.util.Scanner;

public class Fact {
    Scanner sc=new Scanner(System.in);
    public int factorial(){
        System.out.println("Enter the value to find factorial");
        int fact = sc.nextInt();
        int result = 1;
        for(int i =1; i<=fact;i++){
            result*=i;
        }
        System.out.println("The factorial of a number " +fact+" is :  "+result);
        return result;
    }
}
