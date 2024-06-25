package tutorial.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Manager {
    @Autowired
    private Employee employee;



    //  with using constructor
//    @Autowired
//    public Manager(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
