package assignment5;

import java.util.Objects;

public class Snack implements Food {
    String name;
    int weight;
    int calories;

    public Snack(String name, int weight, int calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCalories() {
        return calories;
    }

    // IGNORE THE METHODS BELOW HERE AND DO NOT MODIFY THEM

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return weight == fruit.weight &&
                calories == fruit.calories &&
                Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, calories);
    }
}
