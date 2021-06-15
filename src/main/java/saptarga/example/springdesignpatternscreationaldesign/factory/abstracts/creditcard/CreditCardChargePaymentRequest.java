package saptarga.example.springdesignpatternscreationaldesign.factory.abstracts.creditcard;

import lombok.Getter;
import lombok.Setter;
import saptarga.example.springdesignpatternscreationaldesign.factory.abstracts.ChargePaymentRequest;
import saptarga.example.springdesignpatternscreationaldesign.factory.abstracts.PaymentMethod;

public class CreditCardChargePaymentRequest implements ChargePaymentRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee() {
        return getAmount() * 5 / 100;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
