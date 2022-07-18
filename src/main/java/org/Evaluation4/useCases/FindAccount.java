package org.Evaluation4.useCases;

import org.Evaluation4.Dao.AccountDao;
import org.Evaluation4.Dao.AccountImplementation;
import org.Evaluation4.Entities.Account;
import org.Evaluation4.Exception.InvalidAccount;

import java.util.Scanner;

public class FindAccount {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter iD");
        int id= sc.nextInt();

        try {
            AccountDao dao=new AccountImplementation();
            Account account=dao.findById(id);
            System.out.println(account);
        }catch (InvalidAccount invalidAccount){
            System.out.println(invalidAccount.getMessage());
        }

    }
}
