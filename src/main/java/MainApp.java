import example.com.domain.Department;
import example.com.domain.Employee;
import example.com.services.DepartmentService;
import example.com.services.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Optional;

public class MainApp {
    public static void main(String[] args) {
        //System.out.println("hello");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        DepartmentService departmentService = context.getBean("departmentService", DepartmentService.class);
        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

        Department department = new Department("R&D", "Research and Development");
        departmentService.save(department);

       Employee employee = new Employee("John Doe", 50000.0, department);
       employeeService.save(employee);

        Optional<Employee> retrievedEmployee = employeeService.findByID(employee);
        retrievedEmployee.ifPresent(System.out::println);

        departmentService.findAll().forEach(System.out::println);

        employeeService.findAll().forEach(System.out::println);
    }

}