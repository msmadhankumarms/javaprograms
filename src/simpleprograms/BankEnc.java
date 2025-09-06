package simpleprograms;
import java.util.Scanner;

public class BankEnc {
    private String accountnumber="1234567890123";
    private String accountHolderName="Madhan";
    private Double balance=1500.67;


    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }
    public void deposit(Double amount){
       Double increase=  amount + getBalance();
        System.out.println("Your Deposit Amount is : " + amount);
        System.out.println(" Your balance is "+increase);
    }

    public void withdraw(Double amount){
        if(balance>=amount) {
            Double draw = getBalance()-amount ;
            System.out.println("Amount withdraw done successfully : "+amount);
            setBalance(draw);
            System.out.println("Remaining Balance is : " + getBalance());
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}


class mains{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            BankEnc b=new BankEnc();
        System.out.println("Enter 1 for withdraw and " + " "+"\n"+"Enter 2 for deposit" + "\n" + "Enter 3 to update the name");
            int a=sc.nextInt();
            switch (a){
                case 1:
                    System.out.println("Enter the Rupees to withdraw");
                    Double wd =  sc.nextDouble();
                    b.withdraw(wd);
                    break;
                case 2:
                    System.out.println("Enter the Rupees to deposit");
                    Double dp=sc.nextDouble();
                    b.deposit(dp);
                    break;
                case 3:
                    System.out.println("Enter name to update ");
                    sc.nextLine();
                    String name=sc.nextLine();
                    b.setAccountHolderName(name);
                    System.out.println("Account holder name updated successfully : "+b.getAccountHolderName());
                    break;
                default:
                    System.out.println("Entered a Wrong Choice");
            }
    }
}