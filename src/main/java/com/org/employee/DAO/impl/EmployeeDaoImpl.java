package com.org.employee.DAO.impl;

import com.org.employee.DAO.EmployeeDao;
import com.org.employee.entity.Employee;
import com.org.employee.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDaoImpl.class);
    @Autowired
    EmployeeRepository employeeRepository;

    // fetching all employees
    public List<Employee> getAllEmployees(){
        List<Employee> emps = (List<Employee>)employeeRepository.findAll();
        return emps;
    }

    // fetching employee by id
    public Employee getEmployeeById(int employeeId){
        return employeeRepository.findByEmployeeId(employeeId);
    }

    // inserting employee
    public void updateEmployee(Employee e) {
        employeeRepository.save(e);
    }


    // deleting employee by id
    public void deleteEmployeeById(int employeeId){
        employeeRepository.deleteById(employeeId);
    }
}
