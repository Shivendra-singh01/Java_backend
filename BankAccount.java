import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {

    private String accountHolderName;
    private float balance;

    public void setName(String name) {
        this.accountHolderName=name;
    }
    public void setBalance(float balance){
        
        if(balance>=0) {
            this.balance=balance;
        }
        else{
            System.out.println("Invalid balance");
        }
        
    }
    public void deposit(float amount) {
        if(amount>0) {
            balance+=amount;
        }
        else{
            System.out.println("Enter valid amount");
        }
        
        
    }
    public void withdraw(float money) {
       if (money <= 0) {
        System.out.println("Enter valid amount to withdraw");
    }
    else if (money > balance) {
        System.out.println("Insufficient balance");
    }
    else if (balance - money < 100) {
        System.out.println("Minimum balance must be maintained");
    }
    else {
        balance -= money;
    }
        
    }

    public void accDetails() {
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Current balance is: "+ balance);
    }

    public static void main(String[] args) {
        BankAccount account_01= new BankAccount();
        account_01.setName("Anshul singh");
        account_01.setBalance(1000);

        BankAccount account_02= new BankAccount();
        account_02.setName("Sidd");
        account_02.setBalance(10000);
        
        BankAccount account_03= new BankAccount();
        account_03.setName("Nitin");
        account_03.setBalance(500);

        ArrayList<BankAccount> accounts= new ArrayList<>();
        accounts.add(account_01);
        accounts.add(account_02);
        accounts.add(account_03);
        
        // accounts.get(0).withdraw(100);
        // accounts.get(1).deposit(100);
        // accounts.get(2).deposit(300);
        // for(BankAccount u: accounts) {
        //     u.accDetails();
        // }
        
        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.println("Enter 1: Deposit");
            System.out.println("Enter 2: Withdraw");
            System.out.println("Enter 3: View All Accounts");
            System.out.println("Enter 4: Exit");
            System.out.print("Please give input: ");
            int i= sc.nextInt();
            switch(i) {
                case 1:
                    System.out.println("Enter your Account index: ");
                    int j=sc.nextInt();
                    if(j>=0 && j<accounts.size()) {
                        System.out.println("Your Accounts Details are:");
                        accounts.get(j).accDetails();
                        System.out.println("Please Verify and enter the Amount to Deposit: ");
                        float newDepositAmount = sc.nextFloat();
                        accounts.get(j).deposit(newDepositAmount);
                        System.out.println("Your Updated Balance is:");
                        accounts.get(j).accDetails();
                    }
                    else{
                        System.out.println("Invalid Index!");
                    }
                    break;
                
                case 2:
                    System.out.println("Enter your Account index: ");
                    int k=sc.nextInt();
                    if(k>=0 && k<accounts.size()) {
                        System.out.println("Your Accounts details are:");
                        accounts.get(k).accDetails();
                        System.out.println("Please Verify and Enter the Amount to Withdraw: ");
                        float newWithdrawAmount = sc.nextFloat();
                        accounts.get(k).withdraw(newWithdrawAmount);
                        System.out.println("Your Updated Balance is:");
                        accounts.get(k).accDetails();
                    }
                    else{
                        System.out.println("Invalid Index!");
                    }
                    break;

                case 3:
                    for(BankAccount u: accounts) {
                    u.accDetails();
                }
                break;

                case 4:
                   System.out.println("Exiting...");
                   sc.close();
                   return; 

                default:
                    System.out.println("Choose a Valid Option!");
            }    
        
        }
    }


}

