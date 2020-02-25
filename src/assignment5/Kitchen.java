package assignment5;

import java.util.HashSet;
import java.util.Set;

public class Kitchen {
    // TODO 5: Add javadoc to the functions in this class as necessary
    Storage fridge;
    Storage pantry;
    // Indicates if a food needs to be refrigerated
    Set<Food> fridgeDirectory = new HashSet<>();

    public Kitchen() {
        fridge = new Refrigerator(50);
        pantry = new Pantry(100);
    }

    // TODO 6: Notice this function has a lot of parameters - could we split it up into multiple to reduce parameters?
    // TODO 7: This function additionally does multiple things - could you extract some logic to new function(s)?
    public boolean addFood(String name, int weight, int calories, int quantity, boolean isFruit) {
        Food f;
        if (isFruit) {
            f = new Fruit(name, weight, calories);
        } else {
            f = new Snack(name, weight, calories);
        }

        if (fridgeDirectory.contains(f)) {
            return this.fridge.addFood(f, quantity);
        } else {
            return this.pantry.addFood(f, quantity);
        }
    }

    // TODO 8: Notice that this function access information related to the Fridge/Pantry that it should not be touching - how can we
    // modify these classes to account for this?
    public int getTotalCalories() {
        int totalCalories = 0;
        for (Food f: this.fridge.getDirectory().keySet()) {
            totalCalories += f.getCalories() * this.fridge.getDirectory().get(f);
        }

        for (Food f: this.pantry.getDirectory().keySet()) {
            totalCalories += f.getCalories() * this.pantry.getDirectory().get(f);
        }

        return totalCalories;
    }

    // TODO 9: After you have made all your changes, add a grocery shopping method that works the same as the assignment from
    //  last week and is compatible with the new classes. Make sure to format your code according to the Google standards. 








}
