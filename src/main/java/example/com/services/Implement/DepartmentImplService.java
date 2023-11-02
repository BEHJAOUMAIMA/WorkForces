package example.com.services.Implement;

import example.com.domain.Department;
import example.com.repositories.DepartmentRepository;
import example.com.services.DepartmentService;

import java.util.List;
import java.util.Optional;

public class DepartmentImplService implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentImplService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department update(Department department) {
        Optional<Department> employee = departmentRepository.findById(department.getId());
        if (employee.isPresent()){
            return departmentRepository.save(department);
        }
        return null;
    }

    @Override
    public void delete(Department department) {
        departmentRepository.delete(department);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> findByID(Long id) {
        return departmentRepository.findById(id);
    }


}