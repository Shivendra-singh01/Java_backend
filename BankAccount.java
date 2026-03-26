import java.util.ArrayList;

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
        account_01.deposit(500);

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
        
        accounts.get(0).withdraw(100);
        accounts.get(1).deposit(100);
        accounts.get(2).deposit(300);

        for(BankAccount u: accounts) {
            u.accDetails();
        }
    }
}

