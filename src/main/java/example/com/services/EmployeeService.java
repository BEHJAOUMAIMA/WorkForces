package example.com.services;

import example.com.domain.Employee;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {

    Employee saveEmployee (Employee employee);
    Employee updateEmployee (Employee employee);
    List <Employee> findAllEmployees();
    Optional<Employee> findEmployeeById (Long id);
    void deleteEmployee(Employee employee);

}
