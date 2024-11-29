public class BankAccount {
    private double balance;//Store account balance

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {//Deposit amount
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount desposited successfully! Your current balace: ₹" + balance);
        } else {
            System.out.println("Invalid Amount ₹! Please try again..");//Error msg for negative amount
        }
    }

    public void withdraw(double amount) {//Withdraw amount
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Your Withdraw request has been  successfull! Your current balance: ₹" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient Amount! Your current balance: ₹" + balance);
        } else {
            System.out.println("Invalid Withdraw request! The amount must be larger than 0..");
        }
    }

    public void checkBalance() {//check bank balance
        System.out.println("Your current balance: ₹" + balance);
    }
}



