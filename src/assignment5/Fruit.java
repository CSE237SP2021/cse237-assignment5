package assignment5;

import java.util.Objects;

public class Fruit implements Food {
    // TODO 4: While comments are great, this class has a lot of unnecessary comments - clean it up so that
    //  it is not so unnecessarily verbose

    // The name of the fruit
    String name;
    // The weight of the fruit
    int weight;
    // The weight of calories in the fruit
    int calories;

    public Fruit(String name, int weight, int calories) {
        // Initialize the name of the fruit
        this.name = name;
        // Initialize the weight of the fruit
        this.weight = weight;
        // Initialize the calories of the fruit
        this.calories = calories;
    }

    /**
     * Gets the name of the fruit
     * @return the name of the fruit
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the weight of the fruit
     * @return the weight of the fruit
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Gets the weight of calories in the fruit
     * @return the weight of calories of the fruit
     */
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
