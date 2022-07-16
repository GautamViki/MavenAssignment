package org.masai.useCases;

import org.masai.DAO.EmployeeDAO;
import org.masai.DAO.EmployeeImplement;

import java.util.Scanner;

public class DeleteByID {
    public static void main(String[] args) {
        EmployeeDAO dao=new EmployeeImplement();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter EmpID : ");
        int id= sc.nextInt();

        boolean bool= dao.deleteEmployee(id);
        if(bool){
            System.out.println("deleted record.......");
        }
        else {
            System.out.println("record not exist....");
        }
    }
}
