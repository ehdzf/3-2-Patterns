package callback_pattern.tasks;

import callback_pattern.callbacks.PaymentMethod;

public class PaymentTask {

    public void processPayment(double amount, PaymentMethod callback) {
        System.out.println("Processing payment of " + amount);


        callback.pay(amount);
    }
}