package example.com.services;

import example.com.domain.Department;
import example.com.repositories.DepartmentRepository;

import java.util.List;
import java.util.Optional;

public class DepartmentImplService implements  DepartmentService{

    private DepartmentService departmentService;
    public DepartmentImplService(DepartmentService departmentService){
        this.departmentService = departmentService;
    }

    @Override
    public Department saveDepartement(Department department){
        return DepartmentRepository.save(department);
    }
    @Override
    public Department updateDepartement(Department department) {
        return null;
    }

    @Override
    public List<Department> findAllDepartements() {

        return DepartmentRepository.findAll();
    }

    @Override
    public Optional<Department> findDepartmentById(Long id) {

        return DepartmentRepository.findById(id);
    }

    @Override
    public void deleteDepartement(Department departments) {
        DepartmentRepository.delete(departments);
    }


}
