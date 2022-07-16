package org.masai.useCases;

import org.masai.DAO.EmployeeDAO;
import org.masai.DAO.EmployeeImplement;
import org.masai.Entities.Employee;

import java.util.List;

public class GetDetailsAll {
    public static void main(String[] args) {
        EmployeeDAO dao=new EmployeeImplement();
        List<Employee> employees=dao.getAllEmployee();
        for (Employee e:employees){
            System.out.println();
            System.out.println("EmpID : "+e.getEmpId());
            System.out.println("Name : "+e.getName());
            System.out.println("Address : "+e.getAddress());
            System.out.println("Salary : "+e.getSalary());
            System.out.println("===========================================");
        }
    }
}
