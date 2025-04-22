package builder_pattern.pizza.builders;

import builder_pattern.pizza.Pizza;

public class SpecialityPizzaBuilder implements PizzaBuilder {

    private final String[] ingredients;
    private final PizzaBuilder builder = new CustomPizzaBuilder();

    public SpecialityPizzaBuilder(String[] ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        return builder.setDough(dough);
    }

    @Override
    public PizzaBuilder setSize(String size) {
        return builder.setSize(size);
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        throw new IllegalArgumentException("Specialities cannot have additional toppings");
    }

    @Override
    public Pizza build() {
        for (String topping : ingredients) {
            builder.addTopping(topping);
        }
        return builder.build();
    }
}
