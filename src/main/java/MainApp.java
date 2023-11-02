import example.com.services.EmployeeImplService;
import example.com.services.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        EmployeeService employeeService = context.getBean("employeeService", EmployeeImplService.class);
    }
}
