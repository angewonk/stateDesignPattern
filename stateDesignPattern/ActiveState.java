package stateDesignPattern;

public class ActiveState implements AccountState {
    @Override
    public void depositState(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("\nDeposited " + amount + ". Current balance: " + account.getBalance());
    }

    private double insufficientFunds(Account account) {
        System.out.println("There is not enough money to withdraw!");
        return account.getBalance();
    }

    @Override
    public void suspendState(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void activateState(Account account) {
        System.out.println("Account is already activated!");
    }
    @Override
    public void withdrawState(Account account, double amount) {
        double updatedBalance = account.getBalance() - amount;
        updatedBalance = updatedBalance < 0 ? insufficientFunds(account) : updatedBalance;
        account.setBalance(updatedBalance);
        System.out.println("\nWithdrawn " + amount + ". Current balance: " + account.getBalance());
    }

    @Override
    public void closeState(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }


}
