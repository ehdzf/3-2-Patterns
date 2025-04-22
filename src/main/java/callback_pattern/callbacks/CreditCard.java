package callback_pattern.callbacks;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " was successful using Credit Card.");
    }


}



