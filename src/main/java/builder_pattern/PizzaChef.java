package builder_pattern;

import builder_pattern.pizza.Pizza;
import builder_pattern.pizza.builders.CustomPizzaBuilder;
import builder_pattern.pizza.builders.HawaiianPizzaBuilder;
import builder_pattern.pizza.builders.PizzaBuilder;
import builder_pattern.pizza.builders.VeggiePizzaBuilder;

public class PizzaChef {


    public Pizza cookHawaiianPizza(String size, String dough) {
        PizzaBuilder builder = new HawaiianPizzaBuilder();
        builder.setDough(dough).setSize(size);
        return builder.build();
    }

    public Pizza cookVeggiePizza(String size, String dough) {
        PizzaBuilder builder = new VeggiePizzaBuilder();
        builder.setDough(dough).setSize(size);
        return builder.build();
    }

    public Pizza cookCustomPizza(String size, String dough, String... toppings) {
        PizzaBuilder builder = new CustomPizzaBuilder();
        builder.setDough(dough).setSize(size);
        for (String topping : toppings) {
            builder.addTopping(topping);
        }
        return builder.build();
    }
}
