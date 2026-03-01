package exercise4.integration;

import exercise4.core.PaymentService;

public class SwitchProviderIntegration implements PaymentService {
    private PaymentService currentProvider;

    public SwitchProviderIntegration() {
        this.currentProvider = null;
    }

    public SwitchProviderIntegration(PaymentService currentProvider) {
        this.currentProvider = currentProvider;
    }

    public void setProvider(PaymentService newProvider) {
        this.currentProvider = newProvider;
    }

    @Override
    public void pay(double amount) {
        currentProvider.pay(amount);
    }
}
