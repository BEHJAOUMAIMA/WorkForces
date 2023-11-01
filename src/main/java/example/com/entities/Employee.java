package example.com.entities;

import java.util.Objects;

public class Employee {

    private Long Id;

    private String fullName;

    private Double salary;

    public Employee() {
    }

    public Employee(String fullName, Double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullName) {
        this.fullName = fullName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(Id, employee.Id) && Objects.equals(fullName, employee.fullName) && Objects.equals(salary, employee.salary);
    }
    
}
