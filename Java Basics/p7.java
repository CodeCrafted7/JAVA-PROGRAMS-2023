import java.util.*;
class Bank{
    String name,type_of_acc;
    long acc_no, balance_amt;
    void put_data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the Depositor:");
        name = sc.nextLine();
        System.out.println("Enter the Type of Account(Saving/Current):");
        type_of_acc = sc.nextLine();
        System.out.println("Enter the Account Number:");
        acc_no = sc.nextLong();
        System.out.println("Enter the Balance Amount:");
        balance_amt = sc.nextLong();
    }
    void deposit_amt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount you have to Deposit:");
        long x = sc.nextLong();
        balance_amt += x;
    }
    void withdraw_amt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Balance Amount: " + balance_amt);
        System.out.println("Enter the amount you have to withdraw:");
        long x = sc.nextLong();
        balance_amt -= x;
    }
    void display(){
        System.out.println("Name:" + name);
        System.out.println("Balance Amount:" + balance_amt);
    }
}
public class p7{
    public static void main(String[] args){
        Bank b = new Bank();
        b.put_data();
        b.deposit_amt();
        b.withdraw_amt();
        b.display();
    }
}
