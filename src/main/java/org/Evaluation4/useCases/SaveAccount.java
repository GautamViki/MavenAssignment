package org.Evaluation4.useCases;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.Evaluation4.Dao.AccountDao;
import org.Evaluation4.Dao.AccountImplementation;
import org.Evaluation4.Entities.Account;

import java.util.Scanner;

public class SaveAccount {
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
        Account account=new Account(id,email,address,balance);
        AccountDao dao=new AccountImplementation();
        dao.save(account);

    }
}
