package collections.programsBasic;
import java.util.Scanner;

public class reverseStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String S1=sc.nextLine();
        String revstr="";
        char ch;
        for(int i=0;i<S1.length();i++){
            ch= S1.charAt(i);
            revstr=ch+revstr;
        }
        System.out.println("Reverse of a string is : "+revstr);
    }
}
