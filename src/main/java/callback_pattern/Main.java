package callback_pattern;

import callback_pattern.callbacks.BankAccount;
import callback_pattern.callbacks.CreditCard;
import callback_pattern.callbacks.Paypal;
import callback_pattern.shop.Shop;
import callback_pattern.tasks.PaymentTask;

public class Main {
    public static void main(String[] args) {

        PaymentTask paymentTask = new PaymentTask();

        Shop shoeShop = new Shop("zapateria juan", paymentTask);

        System.out.println("\nSelling shoes with Credit Card");
        shoeShop.sellShoes("Nike", 129.99, new CreditCard());

        System.out.println("\nSelling shoes with Paypal");
        shoeShop.sellShoes("Adidas", 159.99, new Paypal());

        System.out.println("\nSelling shoes with Bank Account");
        shoeShop.sellShoes("Puma", 99.99, new BankAccount());
    }
}
