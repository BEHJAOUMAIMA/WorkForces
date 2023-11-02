package example.com.services;

import example.com.domain.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    Department saveDepartement(Department department);
    Department updateDepartement(Department departments);
    List<Department> findAllDepartements();
    Optional<Department> findDepartmentById(Long id);
    void deleteDepartement(Department department);
}
