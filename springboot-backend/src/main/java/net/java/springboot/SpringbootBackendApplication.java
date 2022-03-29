package net.java.springboot;

import net.java.springboot.model.Employee;
import net.java.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Employee employee = new Employee();
//        employee.setFirstName("Shashwat");
//        employee.setLastName("Srivastava");
//        employee.setEmailId("jobhihai@gmail.com");
//        employeeRepository.save(employee);
//		Employee employee1 = new Employee();
//		employee1.setFirstName("shan");
//		employee1.setLastName("hai");
//		employee1.setEmailId("shanhai@gmail.com");
////		employeeRepository.save(employee1);
//        Employee employee2 = new Employee();
//        employee2.setFirstName("Rahul");
//        employee2.setLastName("Kumar");
//        employee2.setEmailId("rahulkumar@gmail.com");
//        employeeRepository.save(employee2);
    }
}
