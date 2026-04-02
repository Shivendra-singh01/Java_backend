import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static BankAccount findAccount(HashMap <String,BankAccount> accounts, String name) {
        if(accounts.containsKey(name)) {
            return accounts.get(name);
        }
        else {
            System.out.println("Account not found!");
            return null;
        }
        
    }
    public static void main(String[] args) {
        BankAccount account_01= new BankAccount();
        account_01.setName("Anshul");
        account_01.setBalance(1000);

        BankAccount account_02= new BankAccount();
        account_02.setName("Sidd");
        account_02.setBalance(10000);
        
        BankAccount account_03= new BankAccount();
        account_03.setName("Nitin");
        account_03.setBalance(500);

        // ArrayList<BankAccount> accounts= new ArrayList<>();
        // accounts.add(account_01);
        // accounts.add(account_02);
        // accounts.add(account_03);
        
        // accounts.get(0).withdraw(100);
        // accounts.get(1).deposit(100);
        // accounts.get(2).deposit(300);

        Scanner sc= new Scanner(System.in);

        HashMap <String,BankAccount> accounts = new HashMap<>();
        accounts.put("Anshul", account_01);
        accounts.put("Sidd", account_02);
        accounts.put("Nitin", account_03);

    
        while(true) {
            System.out.println();
            System.out.println("Enter 1: Deposit");
            System.out.println("Enter 2: Withdraw");
            System.out.println("Enter 3: View All Accounts");
            System.out.println("Enter 4: Exit");
            System.out.print("Please give input: ");
            System.out.println();
            int i= sc.nextInt();
            switch(i) {
                case 1:
                    System.out.println("Enter your Account Holder Name: ");
                    sc.nextLine();
                    String j=sc.nextLine();
                    BankAccount acc = findAccount(accounts, j);
                    if(acc!=null) {
                        System.out.println("Enter an amount to deposit: ");
                        float newDepositAmount = sc.nextFloat();
                        acc.deposit(newDepositAmount);
                        System.out.println("Updated account:");
                        acc.accDetails(); 
                    }
                   
                    break;     
                
                
                case 2:
                    System.out.println("Enter your Account Holder Name: ");
                    sc.nextLine();
                    String k=sc.nextLine();
                    BankAccount acco = findAccount(accounts, k);
                    if(acco!=null) {
                        System.out.println("Enter an amount to withdraw: ");
                        float newWithdrawAmount = sc.nextFloat();
                        acco.withdraw(newWithdrawAmount);
                        System.out.println("Updated account:");
                        acco.accDetails();
                    }
                     
                    break;

                case 3:
                    for(String key: accounts.keySet()) {
                    System.out.println("Account: " + key);
                    accounts.get(key).accDetails();
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
