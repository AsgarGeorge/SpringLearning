package tutorial.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("tutorial.autowire.annotation");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.toString());

        Manager manager =(Manager) context.getBean("manager");
        System.out.println(manager.toString());


    }
}
