package stateDesignPattern;

public class SuspendedState implements AccountState {


    @Override
    public void depositState(Account account, double amount) {
        System.out.println("\nYou can't deposit to a suspended account!");
    }

    @Override
    public void withdrawState(Account account, double amount) {
        System.out.println("\nYou can't withdraw from a suspended account!");

    }

    @Override
    public void suspendState(Account account) {
        System.out.println("\nAccount is already suspended!");
    }

    @Override
    public void activateState(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("\nAccount is activated!");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());
    }

    @Override
    public void closeState(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("\nAccount is closed!");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());
    }
}

