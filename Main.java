import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
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

        HashMap <String,BankAccount> accounts = new HashMap<>();
        accounts.put("Anshul", account_01);
        accounts.put("Sidd", account_02);
        accounts.put("Nitin", account_03);

        
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
                    System.out.println("Enter your Account Holder Name: ");
                    sc.nextLine();
                    String j=sc.nextLine();
                    if(accounts.containsKey(j)) {
                        System.out.println("Your Accounts Details are:");
                        accounts.get(j).accDetails();
                        System.out.println("Please Verify and enter the Amount to Deposit: ");
                        float newDepositAmount = sc.nextFloat();
                        accounts.get(j).deposit(newDepositAmount);
                        System.out.println("Your Updated Balance is:");
                        accounts.get(j).accDetails();
                    }
                    else{
                        System.out.println("Name doesn't exist.\n Check the spelling or another name!");
                    }
                    break;
                
                case 2:
                    System.out.println("Enter your Account Holder Name: ");
                    sc.nextLine();
                    String k=sc.nextLine();
                    if(accounts.containsKey(k)) {
                        System.out.println("Your Accounts details are:");
                        accounts.get(k).accDetails();
                        System.out.println("Please Verify and Enter the Amount to Withdraw: ");
                        float newWithdrawAmount = sc.nextFloat();
                        accounts.get(k).withdraw(newWithdrawAmount);
                        System.out.println("Your Updated Balance is:");
                        accounts.get(k).accDetails();
                    }
                    else{
                        System.out.println("Name doesn't exist.\n Check the spelling or another name!");
                    }
                    break;

                case 3:
                    for(String key: accounts.keySet()) {
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
