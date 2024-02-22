package stateDesignPattern;
public class AccountTest {
    public static void main(String[] args) {

        Account myAccount = new Account("1234", 10000.0);//set acct to active state

        System.out.println(myAccount.toString());
        myAccount.activate();// displays "Account is already activated!"

        //Deposit to the account
        myAccount.deposit(1000.0);// update balance and displays account number and
        // current balance. Call the toString() method in deposit().

        //Withdraw to the account
        myAccount.withdraw(100.0);// update balance and displays account number and
        // current balance. Call the toString() method in deposit().


        //Suspend the account
        myAccount.suspend();//displays "Account is suspended!"
        System.out.print(myAccount.toString());

        //Activate the account
        myAccount.activate();//displays "Account is activated!"
        System.out.print(myAccount.toString());

        //Close the account()
        myAccount.close(); //displays "Account is closed!"
        System.out.print(myAccount.toString());

        //Activate the account
        myAccount.activate();// Displays "You cannot activate a closed account!"

        //Suspend the account
        myAccount.suspend();// Displays " You cannot suspend a closed account!"

        //Withdraw to the account
        myAccount.withdraw(500.0);// Show message "You cannot withdraw on a closed account!". Call the toString() to show current balance and account number.

        //Deposit to the account
        myAccount.deposit(1000.0);// Show message "You cannot deposit on closed account displays account!". Call the toString() to show current balance and account number.

    }
}
