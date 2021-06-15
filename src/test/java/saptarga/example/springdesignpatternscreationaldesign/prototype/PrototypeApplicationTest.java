package saptarga.example.springdesignpatternscreationaldesign.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = PrototypeApplication.class)
class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototype(){
        Employee employee1 = applicationContext.getBean("employeeStaff", Employee.class);
        employee1.setName("EKO");
        Employee employee2 = applicationContext.getBean("employeeManager", Employee.class);
        employee2.setName("RIDWAN");

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}