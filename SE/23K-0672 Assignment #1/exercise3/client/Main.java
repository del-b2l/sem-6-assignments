package exercise3.client;

import exercise3.core.PaymentService;
import exercise3.external.TokenPayService;
import exercise3.integration.TokenPayIntegration;

// app entry point

public class Main {
    public static void main(String[] args) {
        TokenPayService tokenPayService = new TokenPayService();
        PaymentService adapter = new TokenPayIntegration(tokenPayService);
        PaymentClient client = new PaymentClient(adapter);
        client.initiatePayment(300.0);
    }
}
