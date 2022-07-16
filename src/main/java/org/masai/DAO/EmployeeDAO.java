package org.masai.DAO;

import org.masai.Entities.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployee();
    public String getAddressOfEmployee(int empId);
    public boolean deleteEmployee(int empId);
    public String[] getNameAndAddress(int empId);
    public String giveBonusToEmployee(int empId, int bonus);
    public void saveDetails(Employee employee);
}
