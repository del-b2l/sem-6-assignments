package exercise2.client;

import exercise2.core.PaymentService;
import exercise2.external.CurrencyPayService;
import exercise2.integration.CurrencyPayIntegration;

public class Main {
    public static void main(String[] args) {
        CurrencyPayService currencyService = new CurrencyPayService();
        PaymentService adapter = new CurrencyPayIntegration(currencyService);
        PaymentClient client = new PaymentClient(adapter);
        client.initiatePayment(150.75);
    }
}