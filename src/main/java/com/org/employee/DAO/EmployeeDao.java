package com.org.employee.DAO;

import com.org.employee.entity.Employee;

import java.util.List;

public interface EmployeeDao  {

    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int employeeId);
    public void updateEmployee(Employee e);
    public void deleteEmployeeById(int employeeId);
}
