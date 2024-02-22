package stateDesignPattern;

public interface AccountState {
    void depositState(Account account, double amount);
    void activateState(Account account);
    void withdrawState(Account account, double amount);
    void suspendState(Account account);
    void closeState(Account account);
}
