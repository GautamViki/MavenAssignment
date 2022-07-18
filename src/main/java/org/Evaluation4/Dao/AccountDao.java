package org.Evaluation4.Dao;

import org.Evaluation4.Entities.Account;
import org.Evaluation4.Exception.InsufficientBalance;
import org.Evaluation4.Exception.InvalidAccount;

public interface AccountDao {
    void save(Account account);
    Account findById(int id) throws InvalidAccount;

    void update(Account account) throws InvalidAccount;
    void remove(Account account) throws InvalidAccount;
    double withdraw(double amount, Account account) throws InsufficientBalance;

    String deposit(double amount, Account account) throws InvalidAccount;
}
