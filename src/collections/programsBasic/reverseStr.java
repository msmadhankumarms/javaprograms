package collections.programsBasic;
import java.util.Scanner;

public class reverseStr {
    public static void main(String[] args) {
     //We are not creating the object because the methods are static
//       A.forrev();
       B.builtin();

    }
}

class A{
    static void forrev(){
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

class B{
    public static void builtin(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Your name");
        String str=s.nextLine();
        StringBuilder sc=new StringBuilder(str);
        sc.reverse();
        System.out.println("Reverse of a name is : "+sc);
        for(int i=4; i<str.length();i++){
            System.out.println(str.charAt(i));
        }

    }
}