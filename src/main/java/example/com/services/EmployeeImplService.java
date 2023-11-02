package example.com.services;

import example.com.domain.Employee;
import example.com.repositories.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeImplService implements EmployeeService{

    private EmployeeService employeeService.;

    public EmployeeImplService(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @Override
    public Employee saveEmployee(Employee employee) {

        return EmployeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {

        return null;
    }

    @Override
    public List<Employee> findAllEmployees() {

        return EmployeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findEmployeeById(Long id) {

        return EmployeeRepository.findById(id);
    }

    @Override
    public void deleteEmployee(Employee employee) {

        EmployeeRepository.delete(employee);
    }

}
