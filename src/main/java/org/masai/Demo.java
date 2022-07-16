package org.masai;

import org.masai.DAO.EmployeeDAO;
import org.masai.DAO.EmployeeImplement;
import org.masai.Entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
    public static void main(String[] args) {
//        EntityManagerFactory emf= Persistence.createEntityManagerFactory("MyUnit1");
//        EntityManager em=emf.createEntityManager();
//        Employee employee=em.find(Employee.class,1);
//        if(employee!=null){
//            System.out.println(employee.getAddress());
//        }else {
//            System.out.println("******************************");
//        }
//        em.close();
        EmployeeDAO dao=new EmployeeImplement();
        String add=dao.getAddressOfEmployee(1);
        System.out.println(add);
    }
}
