package tutorial.autowire.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutowireByNameContext.xml");
        Car bmw = (Car) context.getBean("myCar");
        bmw.display();

    }
}
