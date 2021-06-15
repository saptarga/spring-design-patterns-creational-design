package saptarga.example.springdesignpatternscreationaldesign.singelton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = SingeltonApplication.class)
class SingeltonApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testSingelton(){
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);

        counter1.increment();
        counter2.increment();

        System.out.println(counter1.getValue());
    }

    private void incrementCounterAsync(Counter counter, int total){
        new Thread(() -> {
            for (int i = 0; i < total; i++){
                counter.increment();
            }
        }).start();
    }
}