package stateDesignPattern;

public class ActiveState implements AccountState {
    @Override
    public void depositState(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("\nDeposited " + amount + ". Current balance: " + account.getBalance());
    }

    @Override
    public void suspendState(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("\nAccount is suspended!");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());

    }

    @Override
    public void activateState(Account account) {
        System.out.println("\nAccount is already activated!");
    }

    @Override
    public void withdrawState(Account account, double amount) {
        if (amount > account.getBalance()) {
            System.out.println("There is not enough money to withdraw!");
        } else {
            double updatedBalance = account.getBalance() - amount;
            account.setBalance(updatedBalance);
            System.out.println("\nWithdrawn " + amount + ". Current balance: " + account.getBalance());
        }
    }

    @Override
    public void closeState(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("\nAccount is closed!");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());
    }
}
