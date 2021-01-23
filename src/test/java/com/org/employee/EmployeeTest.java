package com.org.employee;

import com.org.employee.DAO.EmployeeDao;
import com.org.employee.DAO.impl.EmployeeDaoImpl;
import com.org.employee.entity.Employee;
import com.org.employee.exception.EmployeeException;
import com.org.employee.service.EmployeeService;
import com.org.employee.service.impl.EmployeeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@ContextConfiguration(
        classes = {EmployeeServiceImpl.class})
public class EmployeeTest {

    @Autowired
    EmployeeService employeeService;

    Employee e;
    @Before
    public void setUp() {
        e=new Employee();
    }


    @Test
    public  void getEmployeeTest() throws EmployeeException{
        List<Employee> result=employeeService.getAllEmployees();
        assertNotNull("not null" +result);
    }
}
