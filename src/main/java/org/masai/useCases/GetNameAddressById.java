package org.masai.useCases;

import org.masai.DAO.EmployeeDAO;
import org.masai.DAO.EmployeeImplement;

import java.util.Scanner;

public class GetNameAddressById {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter EmpID");
        int id= sc.nextInt();

        EmployeeDAO dao=new EmployeeImplement();
        String []detail= dao.getNameAndAddress(id);
        if (detail[0]==null && detail[1]==null){
            System.out.println("Record not exist......");
        }
        else {
            System.out.println("Name : "+detail[0]);
            System.out.println("Address : "+detail[1]);
        }
    }
}
