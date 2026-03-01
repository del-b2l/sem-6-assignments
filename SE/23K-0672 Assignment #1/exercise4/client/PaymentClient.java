package exercise4.client;

import exercise4.core.PaymentService;

// class represents [existing] client code
// depends only on internal PaymentService interface
// do not modify!

public class PaymentClient {
    private final PaymentService paymentService; // constant, value won't change

    public PaymentClient(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void initiatePayment(double amount) {
        System.out.println("Client initiating payment...");
        paymentService.pay(amount);
        System.out.println("Payment completed successfully.");
    }
}
