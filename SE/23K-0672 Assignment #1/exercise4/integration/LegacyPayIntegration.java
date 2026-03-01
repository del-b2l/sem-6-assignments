package exercise4.integration;

import exercise4.core.PaymentService;
import exercise4.external.ProviderService;

public class LegacyPayIntegration implements PaymentService {
    private final ProviderService service;

    public LegacyPayIntegration(ProviderService service) {
        this.service = service;
    }

    @Override
    public void pay(double amount) {
        System.out.println("[LegacyPayService] Processing payment of $" + amount);
        service.makePayment(amount);
    }
}
