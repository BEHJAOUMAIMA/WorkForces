package example.com.services;

import example.com.entities.Department;
import example.com.entities.Employee;

public class EmployeeService {

    private Employee employee;
    private Department department;


    public EmployeeService( Employee employee, Department department){

        this.employee = employee;

        this.department = department;

    }


}
