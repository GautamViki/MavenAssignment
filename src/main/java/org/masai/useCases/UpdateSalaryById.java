package org.masai.useCases;

import org.masai.DAO.EmployeeDAO;
import org.masai.DAO.EmployeeImplement;

import java.util.Scanner;

public class UpdateSalaryById {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter EmpId");
        int id= sc.nextInt();
        System.out.println("Enter bonus salary");
        int bonus= sc.nextInt();

        EmployeeDAO dao=new EmployeeImplement();
        String message= dao.giveBonusToEmployee(id,bonus);
        System.out.println(message);
    }
}
