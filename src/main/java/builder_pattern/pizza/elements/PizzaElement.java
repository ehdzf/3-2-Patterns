package builder_pattern.pizza.elements;

import java.util.Arrays;

public class PizzaElement {
    private final String[] validValues;
    private final String value;

    public PizzaElement(String[] validValues, String value) {
        this.validValues = validValues;
        this.value = value;
    }

    public boolean isValidValue(String value) {
        return Arrays.asList(validValues).contains(value);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PizzaElement{" +
                "value='" + value + '\'' +
                '}';
    }
}
