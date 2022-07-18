package org.Evaluation4.useCases;

import org.Evaluation4.Dao.AccountDao;
import org.Evaluation4.Dao.AccountImplementation;
import org.Evaluation4.Entities.Account;
import org.Evaluation4.Exception.InsufficientBalance;

import java.util.Scanner;

public class Withdraw extends InsufficientBalance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id");
        int id= sc.nextInt();
        System.out.println("Enter Email");
        String email=sc.next();
        System.out.println("Enter Address");
        String address=sc.next();
        System.out.println("Enter Balance");
        double balance= sc.nextDouble();
        System.out.println("Enter ammount");
        double amount= sc.nextDouble();
        try {
            Account account=new Account(id,email,address,balance);
            AccountDao dao=new AccountImplementation();
            double val=dao.withdraw(amount,account);
            System.out.println("Amount"+val);
        }catch (InsufficientBalance e){
            System.out.println(e.getMessage());
        }

    }

}
