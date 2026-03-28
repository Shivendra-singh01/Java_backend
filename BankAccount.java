
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

    

}

