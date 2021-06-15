package saptarga.example.springdesignpatternscreationaldesign.factory.abstracts.creditcard;

import lombok.Getter;
import lombok.Setter;
import saptarga.example.springdesignpatternscreationaldesign.factory.abstracts.GetBalancePaymentRequest;
import saptarga.example.springdesignpatternscreationaldesign.factory.abstracts.PaymentMethod;

public class CreditCardGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
