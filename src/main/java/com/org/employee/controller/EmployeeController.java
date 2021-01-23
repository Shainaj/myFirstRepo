package com.org.employee.controller;

/*
* employee controller class to define end points
* */

import com.org.employee.entity.Employee;
import com.org.employee.exception.EmployeeException;
import com.org.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    static final Logger logger  = LogManager.getLogger(EmployeeController.class.getName());

    @Autowired
    EmployeeService employeeService;

    // inserting employee
    @PutMapping("/updateEmployee")
    public void updateEmployees(@RequestBody Employee employee) throws  EmployeeException{
        logger.info("Inside update employee method");
        employeeService.updateEmployee(employee);
    }

    // displaying list of all employees
    @GetMapping("/employeeList")
    public List<Employee> getAllEmployee() throws EmployeeException{
        logger.info("Inside get all employee details method");
        return employeeService.getAllEmployees();
    }

    // displaying employee by id
    @GetMapping("/employeeById/{id}")
    public Employee getEmployeeById(@PathVariable int id) throws EmployeeException{
        logger.info("Inside get employee by id details method {}",id);
        return employeeService.getEmployeeById(id);
    }

    // deleting employee by id
    @DeleteMapping("deleteEmployee/{id}")
    public void deleteEmployeeByID(@RequestBody Employee e, @PathVariable int id) throws  EmployeeException{
        logger.info("Inside get employee by id details method {}",id);
        employeeService.deleteEmployeeById(id);
    }


}
