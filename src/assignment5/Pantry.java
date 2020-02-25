package assignment5;

import java.util.Map;

public class Pantry implements Storage {

    public Map<Food, Integer> getDirectory() {
        return directory;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    // TODO 3: This class is completely out of order, fix it so that it follows the flow of a normal class

    /**
     * Adds a food to the storage if the capacity allows for it. Otherwise, it does not add it at all.
     * @param f the food to be added
     * @param quantity the amount of food to be added
     * @return indicates if the food was added
     */
    public boolean addFood(Food f, int quantity) {
        int totalWeight = f.getWeight() *  quantity;
        if (this.currentSize + totalWeight < capacity) {
            if (this.directory.containsKey(f)) {
                this.directory.put(f, this.directory.get(f) + quantity);
            } else {
                this.directory.put(f, quantity);
            }
            this.currentSize += totalWeight;
            return true;
        }
        return false;
    }

    public Pantry(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Removes a certain amount of a given food from the pantry. If not enough of that food is there, it returns what is available
     * @param f the food to be removed
     * @param quantity the amount to be removed
     * @return the amount that was removed
     */
    public int removeFood(Food f, int quantity) {
        if (this.directory.containsKey(f)) {
            int currAmount = this.directory.get(f);
            if (currAmount > quantity) {
                this.directory.put(f, currAmount - quantity);
                this.currentSize -= quantity * f.getWeight();
                return quantity;
            } else {
                this.directory.put(f, 0);
                this.currentSize -= currAmount * f.getWeight();
                return currAmount;
            }
        }
    }

    Map<Food, Integer> directory;
    int capacity;
    int currentSize;


}
