package builder_pattern;

import builder_pattern.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        try {
            PizzaChef pizzaChef = new PizzaChef();
            Pizza hawaiian = pizzaChef.cookHawaiianPizza("small", "thin");
            Pizza veggie = pizzaChef.cookVeggiePizza("large", "thick");

            Pizza custom = pizzaChef.cookCustomPizza("medium",
                    "thick",
                    "bell pepper",
                    "mushrooms",
                    "onions",
                    "sausage");

            System.out.println(veggie);
            System.out.println(hawaiian);
            System.out.println(custom);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
