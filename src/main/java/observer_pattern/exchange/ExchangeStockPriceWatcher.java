package observer_pattern.exchange;

import observer_pattern.stock.Stock;
import observer_pattern.subscriber.StockEventListener;

public class ExchangeStockPriceWatcher implements StockEventListener {
    private final Exchange exchange;

    public ExchangeStockPriceWatcher(Exchange exchange) {
        this.exchange = exchange;

    }


    @Override
    public void update(String topic, Stock stock) {
        System.out.println("Exchange " + this.exchange.getName() + " received update on topic: " + topic + " with message: " + stock.getPrice());
    }
}
