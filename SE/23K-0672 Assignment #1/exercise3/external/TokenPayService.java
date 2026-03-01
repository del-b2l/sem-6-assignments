package exercise3.external;

public class TokenPayService {
    public void makePayment(double valueInDollars) {
        System.out.println("[AlphaSoft Log] Payment successful -> TXN-OK :: Amount=" + valueInDollars);
    }
}
