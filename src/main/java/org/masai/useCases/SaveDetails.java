package org.masai.useCases;

import org.masai.DAO.EmployeeDAO;
import org.masai.DAO.EmployeeImplement;
import org.masai.Entities.Employee;

import java.util.Scanner;

public class SaveDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter EmpId : ");
        int id= sc.nextInt();
        System.out.print("Enter Name : ");
        String name=sc.next();
        System.out.print("Enter Address : ");
        String address=sc.next();
        System.out.print("Enter Salary : ");
        int salary= sc.nextInt();

        Employee employee=new Employee(id,name,address,salary);
        EmployeeDAO dao=new EmployeeImplement();
        dao.saveDetails(employee);
    }
}
