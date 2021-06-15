package saptarga.example.springdesignpatternscreationaldesign.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PrototypeApplication {

    @Bean
    @Scope("prototype")
    public Employee employeeStaff(){
        Employee employee = Employee.builder()
                .position(Position.STAFF)
                .salary(10_000_000L)
                .build();
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeManager(){
        return Employee.builder()
                .position(Position.MANAGER)
                .salary(20_000_000L)
                .build();
    }
}
