package mmt.com.controller;

import mmt.com.entity.Employee;
import mmt.com.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/createEmployee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
      // http://localhost:8080/api/createEmployee/emp
    @PostMapping("/emp")
      public ResponseEntity<?> createEmployee(@RequestBody Employee employee){
        Employee employee1 = employeeService.createEmployee(employee);
        Long id = employee1.getId();
        return new ResponseEntity<>(id, HttpStatus.CREATED);
      }
}
