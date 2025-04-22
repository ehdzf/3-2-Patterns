package builder_pattern.pizza.elements;

public class PizzaDough extends PizzaElement {
    private static final String[] sizes = {"thin", "thick", "cheese crust"};


    public PizzaDough(String size) {
        super(sizes, size);
    }


}
