package simpleprograms;
import java.util.Scanner;


public class reversestr {
    Scanner sc=new Scanner(System.in);
    public void revers(){
        System.out.println("Enter the Word to reverse that word");
        String s= sc.nextLine();
        String s2="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            s2=ch+s2;
            //ascii value also can be found
            int ascii = (int)ch;
            System.out.println(ch + " : " + ascii);
        }
        System.out.println("Reverse of a string is : " + s2);
    }


}


