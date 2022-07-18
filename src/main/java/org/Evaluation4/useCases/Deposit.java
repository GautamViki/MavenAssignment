package org.Evaluation4.useCases;

import org.Evaluation4.Dao.AccountDao;
import org.Evaluation4.Dao.AccountImplementation;
import org.Evaluation4.Entities.Account;
import org.Evaluation4.Exception.InsufficientBalance;
import org.Evaluation4.Exception.InvalidAccount;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id");
        int id = sc.nextInt();
        System.out.println("Enter Email");
        String email = sc.next();
        System.out.println("Enter Address");
        String address = sc.next();
        System.out.println("Enter Balance");
        double balance = sc.nextDouble();
        System.out.println("Enter ammount");
        double amount = sc.nextDouble();
        try {
            Account account = new Account(id, email, address, balance);
            AccountDao dao = new AccountImplementation();
            String val = dao.deposit(amount, account);
            System.out.println(val);
        } catch (InvalidAccount e) {
            System.out.println(e.getMessage());
        }
    }
}
