package org.masai.useCases;

import org.masai.DAO.EmployeeDAO;
import org.masai.DAO.EmployeeImplement;

import java.util.Scanner;

public class GetAddressBYID {
    public static void main(String[] args) {

        EmployeeDAO dao=new EmployeeImplement();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter EmpID : ");
        int id= sc.nextInt();
        String add=dao.getAddressOfEmployee(id);
        if (add==null){
            System.out.println("Employee does not Exist.....");
        }else {
            System.out.println(add);
        }

    }
}
