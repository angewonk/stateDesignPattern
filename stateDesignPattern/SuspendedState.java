package stateDesignPattern;

public class SuspendedState implements AccountState {
    @Override
    public void depositState(Account account, double amount) {
        System.out.println("You can't deposit to a suspended account!");
    }

    @Override
    public void withdrawState(Account account, double amount) {
        System.out.println("You can't withdraw from a suspended account!");
    }

    @Override
    public void suspendState(Account account) {
        System.out.println("Account is already suspended!");
    }

    @Override
    public void activateState(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("Account is activated!");
    }

    @Override
    public void closeState(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }
}

