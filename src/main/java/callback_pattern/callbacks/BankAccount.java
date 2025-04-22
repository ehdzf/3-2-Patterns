package callback_pattern.callbacks;

public class BankAccount implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " was successful using Bank Account.");
    }


}