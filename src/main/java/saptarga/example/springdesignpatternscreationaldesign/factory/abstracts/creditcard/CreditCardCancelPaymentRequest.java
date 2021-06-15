package saptarga.example.springdesignpatternscreationaldesign.factory.abstracts.creditcard;

import lombok.Getter;
import lombok.Setter;
import saptarga.example.springdesignpatternscreationaldesign.factory.abstracts.CancelPaymentRequest;
import saptarga.example.springdesignpatternscreationaldesign.factory.abstracts.PaymentMethod;

public class CreditCardCancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
