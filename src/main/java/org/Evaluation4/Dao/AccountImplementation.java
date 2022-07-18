package org.Evaluation4.Dao;

import org.Evaluation4.Entities.Account;
import org.Evaluation4.Exception.InsufficientBalance;
import org.Evaluation4.Exception.InvalidAccount;
import org.Evaluation4.Utility.AccountUtility;

import javax.persistence.EntityManager;

public class AccountImplementation implements AccountDao{
    @Override
    public void save(Account account) {
        EntityManager em= AccountUtility.provideEntityManager();
        em.getTransaction().begin();
        em.persist(account);
        em.getTransaction().commit();
        em.close();
        System.out.println("Account open");
    }

    @Override
    public Account findById(int id) throws InvalidAccount {
        EntityManager em= AccountUtility.provideEntityManager();
        Account account=em.find(Account.class,id);
        if(account!=null){
            return account;
        }
        return null;
    }

    @Override
    public void update(Account account) throws InvalidAccount {
        EntityManager em=AccountUtility.provideEntityManager();

        em.getTransaction().begin();

        em.merge(account);

        em.getTransaction().commit();


        em.close();
        System.out.println("Updated......");
    }

    @Override
    public void remove(Account account) throws InvalidAccount {
        EntityManager em= AccountUtility.provideEntityManager();
        Account acc=em.find(Account.class, account.getId());
        if(acc != null){
            em.getTransaction().begin();
            em.remove(acc);
            em.getTransaction().commit();
        }
        em.close();
        System.out.println("Deleted........");
    }

    @Override
    public double withdraw(double amount, Account account) throws InsufficientBalance {
        EntityManager em= AccountUtility.provideEntityManager();
        Account acc=em.find(Account.class, account.getId());

        if(acc.getBalance()>=amount){
            em.getTransaction().begin();
            double val=acc.getBalance()-amount;
            acc.setBalance(val);
            em.getTransaction().commit();
        }
        return (acc.getBalance());
    }

    @Override
    public String deposit(double amount, Account account) throws InvalidAccount {
        EntityManager em= AccountUtility.provideEntityManager();
        Account acc=em.find(Account.class, account.getId());
        if(acc!=null){
            em.getTransaction().begin();
            double val=acc.getBalance()+amount;
            acc.setBalance(val);
            em.getTransaction().commit();
            return "deposited";
        }
        return "not deposited";
    }
}
