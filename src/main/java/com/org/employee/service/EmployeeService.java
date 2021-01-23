package com.org.employee.service;

import com.org.employee.entity.Employee;
import com.org.employee.exception.EmployeeException;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees() throws  EmployeeException;
    public Employee getEmployeeById(int employeeId) throws EmployeeException;
    public void updateEmployee(Employee e) throws EmployeeException;
    public void deleteEmployeeById(int employeeId) throws  EmployeeException;

}
