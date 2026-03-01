package exercise5.external;

public class MockPayService {
    public void makeFakePayment(double dollars) {
        System.out.println("[MockPayService] Simulating payment of $" + dollars);
        System.out.println("[Test Mode] No real transaction executed.");
    }
}