package net.java.springboot.controller;

import net.java.springboot.model.Employee;
import net.java.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//its allows all origins, all headers, and the HTTP methods specified in the @RequestMapping annotation
@CrossOrigin("*")
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
    //build and create employee rest api
    @PostMapping
//    maps HTTP POST requests onto specific handler methods.
//    request body converts the json incoming file to java object
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

}
