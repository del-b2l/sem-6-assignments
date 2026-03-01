package exercise2.integration;

import exercise2.core.PaymentService;
import exercise2.external.CurrencyPayService;

public class CurrencyPayIntegration implements PaymentService {
    private final CurrencyPayService currencyService;

    public CurrencyPayIntegration(CurrencyPayService currencyService) {
        this.currencyService = currencyService;
    }

    @Override
    public void pay(double amount) {
        currencyService.processDollarPayment(amount, "USD");
    }
}