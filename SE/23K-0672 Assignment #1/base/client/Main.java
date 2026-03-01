package base.client;

import base.core.PaymentService;
import base.external.LegacyPayService;
import base.integration.LegacyPayIntegration;

// app entry point

public class Main {
    public static void main(String[] args) {
        // incompatible third-party service
        LegacyPayService legacyService = new LegacyPayService();

        // adapter that makes it compatible with AlphaSoft
        PaymentService adapter = new LegacyPayIntegration(legacyService);

        // client code using the adapter through the standard interface
        PaymentClient client = new PaymentClient(adapter);

        // final output
        client.initiatePayment(250.0);
    }
}
