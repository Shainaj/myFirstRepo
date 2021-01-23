package com.org.employee.service.impl;

import com.org.employee.DAO.EmployeeDao;
import com.org.employee.entity.Employee;
import com.org.employee.service.EmployeeService;
import com.org.employee.exception.EmployeeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// employee service class
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);
    @Autowired
    EmployeeDao employeeDao;

    // fetching all employees
    public List<Employee> getAllEmployees() throws  EmployeeException{
        LOGGER.info("Inside get all employee method of EmployeeServiceImpl ");
        List<Employee> eList= new ArrayList<>();
        try{
            eList=employeeDao.getAllEmployees();
        }catch (Exception e){
            LOGGER.error("Exception occured while getting employee deatils{}",e.getMessage());
            throw new EmployeeException("Exception occured while getting employee deatils");
        }
        return eList;
    }

    // fetching employee by id
    public Employee getEmployeeById(int id) throws  EmployeeException{
        LOGGER.info("Inside get employee by id  method of EmployeeServiceImpl");
        Employee emp= new Employee();
        try{
            emp=employeeDao.getEmployeeById(id);
        }catch (Exception e){
            LOGGER.error("Exception occured while getting employee deatils{}-{}",e.getMessage(),id);
            throw new EmployeeException("Exception occured while getting employee deatils {}");
        }
        return emp;

    }

    // inserting employee
    public void updateEmployee(Employee emp) throws EmployeeException {
        LOGGER.info("Inside update employee method of EmployeeServiceImpl");
        if(emp!=null){
            employeeDao.updateEmployee(emp);
        }else {
            LOGGER.debug("Exception occured while deletting employee deatils{}-{}");
            throw new EmployeeException("Exception occured while updating employee deatils {}");
        }

    }

    // deleting employee by id
    public void deleteEmployeeById(int employeeId) throws  EmployeeException{
        LOGGER.info("Inside update employee by id  method of EmployeeServiceImpl");
        try{
            employeeDao.deleteEmployeeById(employeeId);
        }catch (Exception e){
            LOGGER.error("Exception occured while deletting employee deatils{}-{}",e.getMessage(),employeeId);
            throw new EmployeeException("Exception occured while getting employee deatils {}");
        }

    }


}
