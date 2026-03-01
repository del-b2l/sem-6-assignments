package exercise2.external;

public class CurrencyPayService {
    public void processDollarPayment(double dollars, String currency) {
        System.out.println("[GlobalPayService] Processing " + dollars + " " + currency);
    }
}