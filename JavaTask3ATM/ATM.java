import java.util.Scanner;//saving user input

public class ATM {
    private BankAccount account;//reference for user's Bank Account

    public ATM(BankAccount account) {//linking user with bank account 
        this.account = account;
    }

    public void getMenu() {//showing menu which handles user data
        Scanner scan = new Scanner(System.in);
        int getOption;

        do {//different menu options
            System.out.println("    **** Welcome to ATM MAchine ****    ");
            System.out.println("\n    **** ATM Menu List ****    ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");
            getOption = scan.nextInt();


            switch (getOption) {//switch cases for different menu options
                case 1://for deposits
                    System.out.println("Enter amount to be deposited: ₹");
                    double depositedAmount = scan.nextDouble();
                    account.deposit(depositedAmount);
                    break;
                
                case 2://for withdraw
                    System.out.println("Enter amount to be withdrawn: ₹");
                    double withdrawnAmount = scan.nextDouble();  
                    account.withdraw(withdrawnAmount); 
                    break;
                 
                case 3://to check balance
                    account.checkBalance();
                    break;
                    
                case 4://to exit menu
                    System.out.println("Thank you for using the ATM! Have a nice day ahead..");  
                    break;
                    
                    
                default://invalid option
                    System.out.println("Invalid Option! Please try again..");
            } 
        } while (getOption != 4);//exit
        scan.close();//scanner close
    }
}
