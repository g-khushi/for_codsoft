import java.util.*;
class Bank
{
    Scanner obj= new Scanner(System.in);
     int balance;
    int amount;
    public Bank(int initial_balance)
    {
        this.balance= initial_balance;
    }
    public void checkbalance()
    {
        System.out.println("Current balance:"+ balance);
    }

    public void deposit()
    {
        System.out.println("Enter the amount to be deposited:");
        amount = obj.nextInt();
        if(amount<=0)
        {
            System.out.println("Invalid deposit amount");
            System.out.println("Transaction Failed");
        }
        else
        {
            balance+=amount;
            System.out.println(+amount +" has been deposited.\n Remaining Balance: "+balance);
            System.out.println("Transaction Successful");

        }
    }
    public void withdraw()
    {
        System.out.println("Enter the amount to be withdrawn:");
        amount= obj.nextInt();
        if(amount<0)
        {
        System.out.println("Insufficient input");
        return;
        }
        if(balance< amount)
        {
            System.out.println("Insufficient balance");
            System.out.println("Transaction Failed");
        }
        else
        {
            balance-=amount;
            System.out.println(+amount + " has been withdrawn.\nRemaining Balance: "+balance);
            System.out.println("Transaction Successful");

        }
    }
}
class ATM extends Bank
{
    ATM(int balance)
    {
        super(balance);
    }

    public void input()
    {
        int choice;
        do{
            System.out.println("Enter 1 for withdraw.");
            System.out.println("Enter 2 for deposit.");
            System.out.println("Enter 3 for checking balance.");
            System.out.println("Enter 4 for exit.");
            choice = obj.nextInt();
        
        
            switch (choice) {
            case 1:withdraw();
                   System.out.println();
                   break;
            case 2: deposit();
                    System.out.println();
                    break;
            case 3: checkbalance();
                    System.out.println();
                    break;
            case 4: System.out.println("Thankyou for using ATM");
                    break;
            default: System.out.println("Invalid input");
                    break;
          }
         
        
        } while(choice!=4);

          
    }
}
public class Task3
{
    public static void main(String[] args)
    {
       ATM user1= new ATM(5000);
       user1.input();
    }
}
