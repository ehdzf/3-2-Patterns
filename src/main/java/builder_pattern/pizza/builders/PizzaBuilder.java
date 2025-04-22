package builder_pattern.pizza.builders;

import builder_pattern.pizza.Pizza;

public interface PizzaBuilder {
    PizzaBuilder setSize(String size);

    PizzaBuilder setDough(String dough);

    PizzaBuilder addTopping(String topping);

    Pizza build();
}
