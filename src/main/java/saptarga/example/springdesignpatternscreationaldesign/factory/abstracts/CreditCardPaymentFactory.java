package saptarga.example.springdesignpatternscreationaldesign.factory.abstracts;

import org.springframework.context.annotation.Configuration;
import saptarga.example.springdesignpatternscreationaldesign.factory.abstracts.creditcard.CreditCardCancelPaymentRequest;
import saptarga.example.springdesignpatternscreationaldesign.factory.abstracts.creditcard.CreditCardChargePaymentRequest;
import saptarga.example.springdesignpatternscreationaldesign.factory.abstracts.creditcard.CreditCardGetBalancePaymentRequest;

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory{
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new CreditCardChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new CreditCardCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
//        throw new UnsupportedOperationException("get Balance is not supported in Credit Card");
        return new CreditCardGetBalancePaymentRequest();
    }
}
