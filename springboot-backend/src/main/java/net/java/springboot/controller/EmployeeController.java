package net.java.springboot.controller;

import net.java.springboot.model.Employee;
import net.java.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//allows the class to handle the requests made by the client.REST stands for representational state transfer
@RestController
//map web requests onto specific handler classes and/or handler methods.
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    //whenever data is entered in the db it needs to be as an object and for that autowired is used which automatically creates an object for that
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping//maps HTTP GET requests onto specific handler methods but not classes
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
