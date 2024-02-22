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
        String withdraw = (amount > account.getBalance()) ? "There is not enough money to withdraw!" :
                (amount <= account.getBalance()) ? ("\nWithdrawn " + amount + ". Current balance: " + (account.getBalance() - amount)) :
                        "Invalid amount";
        account.setBalance((amount <= account.getBalance()) ? (account.getBalance() - amount) : account.getBalance());
        System.out.println(withdraw);
    }



    @Override
    public void closeState(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("\nAccount is closed!");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());
    }
}
