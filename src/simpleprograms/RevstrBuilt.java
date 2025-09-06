package simpleprograms;
import java.util.Scanner;

//Reverse of a string using string builder form

public class RevstrBuilt {
    Scanner sc = new Scanner(System.in);
    public void reversebuilt(){
        System.out.println("Enter the Word to reverse : ");
       String s= sc.nextLine();
        StringBuilder sc=new StringBuilder(s);
        sc.reverse();
        System.out.println(sc);
    }
}
