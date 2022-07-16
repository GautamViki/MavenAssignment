package org.masai.DAO;

import org.masai.EMPUtility.EmpUtil;
import org.masai.Entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class EmployeeImplement implements EmployeeDAO{
    @Override
    public List<Employee> getAllEmployee() {
EntityManager em=EmpUtil.provideEntityManager();
        Query query= em.createQuery("Select e from Employee e");
        List<Employee>employees=(List<Employee>) query.getResultList();
        return employees;
    }

    @Override
    public String getAddressOfEmployee(int empId) {
//        EntityManagerFactory emf= Persistence.createEntityManagerFactory("MyUnit1");
        EntityManager em= EmpUtil.provideEntityManager();
        Employee employee=em.find(Employee.class,empId);
        String add=null;
        if(employee!=null){
            add=employee.getAddress();
        }
        em.close();
        return add;
    }

    @Override
    public boolean deleteEmployee(int empId) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("MyUnit1");
        EntityManager em=emf.createEntityManager();
        Employee employee=em.find(Employee.class,empId);
        boolean del=false;
        if (employee!=null){
            em.getTransaction().begin();
            em.remove(employee);
            em.getTransaction().commit();
            del=true;
        }
        em.close();
        return del;
    }

    @Override
    public String[] getNameAndAddress(int empId) {
//        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyUnit1");
        EntityManager em=EmpUtil.provideEntityManager();
        Employee employee=em.find(Employee.class,empId);
        String[]detail=new String[2];
        if (employee!=null){
            detail[0]=employee.getName();
            detail[1]=employee.getAddress();
        }
        return detail;
    }

    @Override
    public String giveBonusToEmployee(int empId, int bonus) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyUnit1");
        EntityManager em=emf.createEntityManager();
        Employee employee=em.find(Employee.class,empId);
        String mes="not updated......";
        if(employee!=null){
            em.getTransaction().begin();
            employee.setSalary(employee.getSalary()+bonus);
            em.getTransaction().commit();
            mes="updated........";
        }
        return mes;
    }

    @Override
    public void saveDetails(Employee employee) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyUnit1");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        em.close();
        System.out.println("inserted details......");
    }
}
