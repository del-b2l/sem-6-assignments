package exercise4.client;

import exercise4.core.PaymentService;
import exercise4.external.ProviderService;
import exercise4.integration.SwitchProviderIntegration;
// 1. ADD THESE IMPORTS
import exercise4.integration.LegacyPayIntegration;
import exercise4.integration.GlobalPayIntegration;

public class Main {
    public static void main(String[] args) {
        ProviderService providerService = new ProviderService();

        PaymentService adapterA = new LegacyPayIntegration(providerService);
        PaymentService adapterB = new GlobalPayIntegration(providerService, "EUR");

        SwitchProviderIntegration wrapper = new SwitchProviderIntegration();

        wrapper.setProvider(adapterA);
        PaymentClient client = new PaymentClient(wrapper);
        client.initiatePayment(120.0);

        System.out.println("[System] Payment provider switched.");

        wrapper.setProvider(adapterB);
        client.initiatePayment(120.0);
    }
}
