package builder_pattern.pizza.builders;

public class VeggiePizzaBuilder extends SpecialityPizzaBuilder {
    private static final String[] ingredients = {"bell pepper", "mushrooms", "onions"};

    public VeggiePizzaBuilder() {
        super(ingredients);
    }
}
