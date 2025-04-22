package observer_pattern;

import observer_pattern.broker.Broker;
import observer_pattern.exchange.Exchange;
import observer_pattern.exchange.ExchangeStockPriceWatcher;
import observer_pattern.stock.Stock;

public class Main {
    public static void main(String[] args) {
        final Broker broker = getBroker();

        Stock appleStock = new Stock("apple", 150.0);
        System.out.println("Initial price for " + appleStock.getName() + ": $" + appleStock.getPrice());
        broker.processStockPrice(appleStock);

        appleStock.setPrice(155.0);
        System.out.println("New price for " + appleStock.getName() + ": $" + appleStock.getPrice());
        broker.processStockPrice(appleStock);

        appleStock.setPrice(130);
        System.out.println("New price for " + appleStock.getName() + ": $" + appleStock.getPrice());
        broker.processStockPrice(appleStock);

    }

    private static Broker getBroker() {
        Broker broker = new Broker();

        Exchange barcelona = new Exchange("BCN");
        Exchange madrid = new Exchange("MAD");
        Exchange valencia = new Exchange("VAL");

        ExchangeStockPriceWatcher barcelonaWatcher = new ExchangeStockPriceWatcher(barcelona);
        ExchangeStockPriceWatcher madridWatcher = new ExchangeStockPriceWatcher(madrid);
        ExchangeStockPriceWatcher valenciaWatcher = new ExchangeStockPriceWatcher(valencia);

        broker.subscribe("rise", barcelonaWatcher);
        broker.subscribe("drop", barcelonaWatcher);

        broker.subscribe("rise", madridWatcher);
        broker.subscribe("drop", madridWatcher);

        broker.subscribe("rise", valenciaWatcher);
        broker.subscribe("drop", valenciaWatcher);
        return broker;
    }
}
