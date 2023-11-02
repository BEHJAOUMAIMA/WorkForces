package example.com.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Id;

import java.util.Objects;


@Entity
public class Employee {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long Id;

    private String employee_name;

    private Double salary;

    @ManyToOne
    private Department department;


    public Employee() {
    }

    public Employee(String employee_name, Double salary, Department department) {
        this.employee_name = employee_name;
        this.salary = salary;
        this.department = department;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", employee_name='" + employee_name + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(Id, employee.Id) && Objects.equals(employee_name, employee.employee_name) && Objects.equals(salary, employee.salary) && Objects.equals(department, employee.department);
    }

}

