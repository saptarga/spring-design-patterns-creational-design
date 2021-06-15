package saptarga.example.springdesignpatternscreationaldesign.singelton;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SingeltonApplication {

    @Bean
    public Counter counter(){
        return new Counter();
    }
}
