package exercise5.client;

import exercise5.core.PaymentService;
import exercise5.external.MockPayService;
import exercise5.integration.MockPayIntegration;

public class Main {
    public static void main(String[] args) {
        MockPayService currencyService = new MockPayService();
        PaymentService adapter = new MockPayIntegration(currencyService);
        PaymentClient client = new PaymentClient(adapter);
        client.initiatePayment(500);
    }
}