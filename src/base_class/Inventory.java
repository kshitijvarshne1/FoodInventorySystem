/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Mar-21
 *   Time: 10:25 PM
 *   File: Inventory.java
 */

package base_class;

public class Inventory {
    private FoodItem foodProduct;
    private int numItems;

    public Inventory(FoodItem foodProduct, int numItems) {
        this.foodProduct = foodProduct;
        this.numItems = numItems;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "foodProduct=" + foodProduct +
                ", numItems=" + numItems +
                '}';
    }

}

