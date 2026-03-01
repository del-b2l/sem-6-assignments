package exercise1.client;

import exercise1.core.PaymentService;
import exercise1.external.CentPayService;
import exercise1.integration.CentPayIntegration;

public class Main {
    public static void main(String[] args) {
        CentPayService centService = new CentPayService();
        PaymentService adapter = new CentPayIntegration(centService);
        PaymentClient client = new PaymentClient(adapter);
        client.initiatePayment(99.99);
    }
}