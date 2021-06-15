package saptarga.example.springdesignpatternscreationaldesign.factory.abstracts;

public interface GetBalancePaymentRequest {

    String getUserId();

    void setUserId(String id);

    PaymentMethod getMethod();
}
