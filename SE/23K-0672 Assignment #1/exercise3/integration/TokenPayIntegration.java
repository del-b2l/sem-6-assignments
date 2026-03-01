package exercise3.integration;

import exercise3.core.PaymentService;
import exercise3.external.TokenPayService;

public class TokenPayIntegration implements PaymentService {
    private final TokenPayService tokenPayService;

    public TokenPayIntegration(TokenPayService tokenPayService) {
        this.tokenPayService = tokenPayService;
    }

    @Override
    public void pay(double amount) {
        tokenPayService.makePayment(amount);
    }
}
