public class ATMApp {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(200.00);//bank account with initial balance of ₹200.00

        ATM atm = new ATM(myAccount);//linking atm input to bank account

        atm.getMenu();//start menu for atm..
    }
}
