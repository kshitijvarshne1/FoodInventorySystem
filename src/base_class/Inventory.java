/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Mar-21
 *   Time: 10:25 PM
 *   File: Inventory.java
 */

package base_class;

import java.util.ArrayList;

public class Inventory {
    private FruitItem fruitItem;
    private Vegetables vegetable;
    private Preserve preserve;
    private int numItems;
    ArrayList<FoodItem> godown;

    public Inventory(FruitItem fruitItem) {
        this.fruitItem = fruitItem;
        this.numItems= 1;
    }
    public Inventory(Vegetables vegetable) {
        this.vegetable = vegetable;
        this.numItems= 1;
    }
    public Inventory(Preserve preserve) {
        this.preserve= preserve;
        this.numItems= 1;
    }
    public Inventory() {
        this.numItems= 0;
    }
    public void addItem(FoodItem ft){
        godown.add(ft);
    }
    public void print(){
        System.out.println(godown.toString());
    }

}

