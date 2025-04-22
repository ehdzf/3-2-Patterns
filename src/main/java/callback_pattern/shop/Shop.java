package callback_pattern.shop;

import callback_pattern.callbacks.PaymentMethod;
import callback_pattern.tasks.PaymentTask;

public class Shop {
    private final String name;
    private final PaymentTask paymentGateway;

    public Shop(String name, PaymentTask paymentGateway) {
        this.name = name;
        this.paymentGateway = paymentGateway;
    }

    public void sellShoes(String shoeModel, double price, PaymentMethod paymentMethod) {
        System.out.println(name + ": Selling " + shoeModel + " shoes for " + price);
        paymentGateway.processPayment(price, paymentMethod);
    }
}
