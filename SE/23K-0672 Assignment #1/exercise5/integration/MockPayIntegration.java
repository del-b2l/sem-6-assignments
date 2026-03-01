package exercise5.integration;

import exercise5.core.PaymentService;
import exercise5.external.MockPayService;

public class MockPayIntegration implements PaymentService {
    private final MockPayService currencyService;

    public MockPayIntegration(MockPayService currencyService) {
        this.currencyService = currencyService;
    }

    @Override
    public void pay(double amount) {
        currencyService.makeFakePayment(amount);
    }
}