package saptarga.example.springdesignpatternscreationaldesign.factory.abstracts;

public interface PaymentFactory {

    ChargePaymentRequest createChargeRequest();

    CancelPaymentRequest createCancelRequest();

    GetBalancePaymentRequest createGetBalanceRequest();
}
