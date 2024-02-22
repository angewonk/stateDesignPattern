package stateDesignPattern;

public class Account {
    private final String accountNumber;
    private double balance;
    private AccountState accountState;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }

    public void deposit(double amount) {
        accountState.depositState(this, amount);
    }

    public void withdraw(double amount) {
        accountState.withdrawState(this, amount);
    }

    public void suspend() {
        accountState.suspendState(this);
    }

    public void activate() {
        accountState.activateState(this);
    }

    public void close() {
        accountState.closeState(this);
    }

    // Getters and setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    @Override
    public String toString() {
        return "Account Number" + accountNumber + ", balance=" + balance + "\n";
    }
}
