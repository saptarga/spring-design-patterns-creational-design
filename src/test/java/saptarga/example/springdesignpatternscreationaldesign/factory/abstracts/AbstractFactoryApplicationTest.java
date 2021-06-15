package saptarga.example.springdesignpatternscreationaldesign.factory.abstracts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = AbstractFactoryApplication.class)
class AbstractFactoryApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    void testAbstractFactory(){
        PaymentFactory paymentFactoryCreditCard = applicationContext.getBean(CreditCardPaymentFactory.class);
        charge(paymentFactoryCreditCard);
    }

    public void charge(PaymentFactory paymentFactory){
        ChargePaymentRequest request = paymentFactory.createChargeRequest();
        request.setId("xxx");
        request.setAmount(100000L);

        // kirim ke payment gateway
        System.out.println(request);
    }

}