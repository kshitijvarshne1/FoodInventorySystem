/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Mar-21
 *   Time: 3:45 PM
 *   File: FoodItem.java
 */

package base_class;

public class FoodItem {
    private int itemCode;
    private String itemName;
    private float itemPrice;
    private int quantityInStock;
    private float itemCost;

    public FoodItem(int itemCode, String itemName, float itemPrice, int quantityInStock, float itemCost) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantityInStock = quantityInStock;
        this.itemCost = itemCost;
    }

}

