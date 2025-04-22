package builder_pattern.pizza.elements;

public class PizzaSize extends PizzaElement {
    private static final String[] sizes = {"Small", "Medium", "Large"};

    public PizzaSize(String size) {
        super(sizes, size);
    }

}
