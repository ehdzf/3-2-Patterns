package builder_pattern.pizza.builders;

import builder_pattern.pizza.Pizza;
import builder_pattern.pizza.elements.PizzaDough;
import builder_pattern.pizza.elements.PizzaSize;
import builder_pattern.pizza.elements.PizzaTopping;

import java.util.HashSet;
import java.util.Set;

public class CustomPizzaBuilder implements PizzaBuilder {

    private final Set<PizzaTopping> pizzaToppings = new HashSet<>();
    private PizzaDough pizzaDough;
    private PizzaSize pizzaSize;

    @Override
    public CustomPizzaBuilder setDough(String dough) {
        this.pizzaDough = new PizzaDough(dough);
        return this;
    }

    @Override
    public CustomPizzaBuilder setSize(String size) {
        this.pizzaSize = new PizzaSize(size);
        return this;

    }

    @Override
    public CustomPizzaBuilder addTopping(String topping) {
        pizzaToppings.add(new PizzaTopping(topping));
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(pizzaSize, pizzaDough, pizzaToppings);
    }
}
