package exercise1.integration;

import exercise1.core.PaymentService;
import exercise1.external.CentPayService;

public class CentPayIntegration implements PaymentService {
    private final CentPayService centService;

    public CentPayIntegration(CentPayService centService) {
        this.centService = centService;
    }

    @Override
    public void pay(double amount) {
        // conversion from dollars to cents
        int cents = (int) Math.round(amount * 100);
        centService.processCentPayment(cents);
    }
}