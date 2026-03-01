package base.integration;

import base.core.PaymentService;
import base.external.LegacyPayService;

// this is the adapter class
// bridges PaymentService (Target)and LegacyPayService (Adaptee)

public class LegacyPayIntegration implements PaymentService {
    private final LegacyPayService legacyService;

    public LegacyPayIntegration(LegacyPayService legacyService) {
        this.legacyService = legacyService;
    }

    @Override
    public void pay(double amount) {
        // translating call: pay(amount) -> makePayment(valueInDollars)
        legacyService.makePayment(amount);
    }
}
