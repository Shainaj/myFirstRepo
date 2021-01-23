package com.org.employee;

import com.org.employee.entity.Employee;
import com.org.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeWebApplication implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    Employee employee;

    public static void main(String[] args )
    {
        SpringApplication.run(EmployeeWebApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        employee = new Employee();
        employee.setEmployeeId(749289);
        employee.setEmailId("sainajnadaf@infosys.com");
        employee.setFirstName("shehanaz");
        employee.setLastName("Nadaf");
        employee.setAge(22);
        employee.setGender("Female");
        employee.setAddress("chadchan karnataka-586205");
        employeeRepository.save(employee);

    }
}
