package base.external;

// class represents a [newly acquired third-party service]
// interface is incompatible w/ Alphasoft's systems
// do not modify this class!

public class LegacyPayService {
    public void makePayment(double valueInDollars) {
        System.out.println("[LegacyPayService] Processing payment of $" + valueInDollars);
    }
}
