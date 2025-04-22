# Design Patterns

This repository demonstrates three important design patterns in software development:

## Builder Pattern

### Description
The Builder pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations. In this implementation, we use the Builder pattern to create different types of pizzas with various attributes.

### Implementation
- `Pizza`: The product class that represents a pizza with attributes like size, dough, and toppings.
- `PizzaBuilder`: Abstract builder interface that defines methods to set pizza attributes and build the final product.
- Concrete Builders:
  - `HawaiianPizzaBuilder`: Builds Hawaiian pizzas with predefined toppings.
  - `VeggiePizzaBuilder`: Builds vegetarian pizzas with predefined toppings.
  - `CustomPizzaBuilder`: Builds custom pizzas with user-specified toppings.
- `PizzaChef`: Director class that uses builders to create different types of pizzas.

### Run the code
```bash
java src/main/java/builder_pattern/Main.java
```

## Callback Pattern

### Description
The Callback pattern allows a method to call another method that is passed as an argument. This pattern is commonly used in event handling, asynchronous programming, and notification systems. In this implementation, we use the Callback pattern for payment processing.

### Implementation
- `PaymentMethod`: Interface defining callback methods for payment success and failure.
- Concrete Callbacks:
  - `CreditCard`: Implements PaymentCallback for credit card payments.
  - `Paypal`: Implements PaymentCallback for PayPal payments.
  - `BankAccount`: Implements PaymentCallback for bank account payments.
- `PaymentTask`: Invokes the appropriate callback methods.
- `Shop`: Uses the payment gateway to process payments with different payment methods.

### Run the code
```bash
java src/main/java/callback_pattern/Main.java
```

## Observer Pattern

### Description
The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. In this implementation, we use the Observer pattern to notify stock exchanges about changes in stock prices.

### Implementation
- `EventManager`: Publisher that maintains a list of subscribers and notifies them of events.
- `StockEventListener`: Interface for subscribers to receive updates.
- `ExchangeStockPriceWatcher`: Concrete subscriber that observes stock price changes.
- `Broker`: Facade that processes stock prices and notifies subscribers when prices rise or drop.
- `Exchange`: Represents a stock exchange that receives notifications.
- `Stock`: Represents a stock with a name and price.

### Run the code
```bash
java src/main/java/observer_pattern/Main.java
```
