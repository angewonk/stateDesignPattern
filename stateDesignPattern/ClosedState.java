package stateDesignPattern;

public class ClosedState implements AccountState {
    @Override
    public void depositState(Account account, double amount) {
        System.out.println("\nYou can't deposit on closed account account!");
    }

    @Override
    public void withdrawState(Account account, double amount) {
        System.out.println("\nYou can't withdraw on a closed account!");
    }

    @Override
    public void suspendState(Account account) {
        System.out.println("\nYou can't suspend a closed account!");
    }

    @Override
    public void activateState(Account account) {
        System.out.println("\nYou can't activate a closed account!");
    }

    @Override
    public void closeState(Account account) {
        System.out.println("\nAccount is already closed!");
    }
}
