package builder_pattern.pizza;

import builder_pattern.pizza.elements.PizzaDough;
import builder_pattern.pizza.elements.PizzaSize;
import builder_pattern.pizza.elements.PizzaTopping;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Pizza {
    private final PizzaSize size;
    private final PizzaDough dough;
    private final Set<PizzaTopping> toppings;


    public Pizza(PizzaSize size, PizzaDough dough, Set<PizzaTopping> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = new HashSet<>(toppings);
    }

    public String getSize() {
        return size.getValue();
    }

    public String getDough() {
        return dough.getValue();
    }

    public Set<String> getToppings() {
        return toppings.stream().map(PizzaTopping::getValue).collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        String allToppings = this.toppings.stream()
                .map(PizzaTopping::getValue)
                .collect(Collectors.joining(", "));
        return "Pizza{" +
                "size=" + size +
                ", dough=" + dough +
                ", toppings=" + allToppings +
                '}';
    }
}
