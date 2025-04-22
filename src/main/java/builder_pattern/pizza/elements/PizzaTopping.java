package builder_pattern.pizza.elements;

public class PizzaTopping extends PizzaElement {
    private static final String[] VALID_TOPPINGS = {"pepperoni",
            "bell pepper",
            "mushrooms",
            "onions",
            "sausage",
            "bacon",
            "extra cheese",
            "pineapple",
            "ham"};

    public PizzaTopping(String topping) {
        super(VALID_TOPPINGS, topping);
    }

}
