/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Mar-21
 *   Time: 3:45 PM
 *   File: FoodItem.java
 */

package base_class;

import java.util.Objects;

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

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public float getItemCost() {
        return itemCost;
    }

    public void setItemCost(float itemCost) {
        this.itemCost = itemCost;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "itemCode=" + itemCode +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", quantityInStock=" + quantityInStock +
                ", itemCost=" + itemCost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodItem foodItem = (FoodItem) o;
        return getItemCode() == foodItem.getItemCode() && Float.compare(foodItem.getItemPrice(), getItemPrice()) == 0 && getQuantityInStock() == foodItem.getQuantityInStock() && Float.compare(foodItem.getItemCost(), getItemCost()) == 0 && Objects.equals(getItemName(), foodItem.getItemName());
    }
}

