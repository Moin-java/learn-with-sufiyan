package mmt.com.service;

import mmt.com.entity.Employee;
import mmt.com.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public  Long createEmployee(Employee employee){

        Employee employee1 = new Employee();
        employee1.setName(employee.getName());
        employee1.setLocation(employee.getLocation());
        employee1.setGender(employee.getGender());

        Employee save = employeeRepository.save(employee);

        return  save.getId();
    }
}
