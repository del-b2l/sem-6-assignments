package exercise4.integration;

import exercise4.core.PaymentService;
import exercise4.external.ProviderService;

public class GlobalPayIntegration implements PaymentService {
    private final ProviderService service;
    private final String currency;

    public GlobalPayIntegration(ProviderService service, String currency) {
        this.service = service;
        this.currency = currency;
    }

    @Override
    public void pay(double amount) {
        System.out.println("[GlobalPayService] Processing " + amount + " " + this.currency);
        service.makePayment(amount);
    }
}
