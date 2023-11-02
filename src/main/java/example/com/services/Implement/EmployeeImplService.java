package example.com.services.Implement;

import example.com.domain.Employee;
import example.com.repositories.EmployeeRepository;
import example.com.services.EmployeeService;

import java.util.List;
import java.util.Optional;

public class EmployeeImplService implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeImplService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employee.getId());
        if (optionalEmployee.isPresent()){
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findByID(Employee employee) {
        return employeeRepository.findById(employee.getId());
    }


}