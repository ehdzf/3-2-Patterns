package callback_pattern.callbacks;

public class Paypal implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " was successful using Paypal.");
    }


}
