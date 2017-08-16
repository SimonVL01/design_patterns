package com.realdolmen.ood020.state;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class PositiveState extends State {
    @Override
    public State debit(BankAccount account, double amount) {
        account.setBalance(account.getBalance() + amount);
        return this;
    }

    @Override
    public State credit(BankAccount account, double amount) {
        account.setBalance(account.getBalance() - amount);
        if (account.getBalance() < 0.0) {
            return new InCreditState();
        } else if (account.getBalance() < -1000.0) {
            return new BankRuptState();
        }
        return this;
    }

    @Override
    public State close(BankAccount account) {
        account.setBalance(0.0);
        return new ClosedState();
    }
}
