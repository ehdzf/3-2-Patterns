package builder_pattern.pizza.builders;

public class HawaiianPizzaBuilder extends SpecialityPizzaBuilder {
    private static final String[] ingredients = {"pineapple", "ham"};

    public HawaiianPizzaBuilder() {
        super(ingredients);
    }
}
