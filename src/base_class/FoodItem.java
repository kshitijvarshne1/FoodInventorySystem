/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Mar-21
 *   Time: 3:45 PM
 *   File: FoodItem.java
 */

package base_class;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

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
    public FoodItem() {
        this.itemCode = 0;
        this.itemName = null;
        this.itemPrice = 0;
        this.quantityInStock = 0;
        this.itemCost = 0;
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
    public FoodItem addItem(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the code for the item: ");
         this.itemCode = sc.nextInt();
        System.out.println("Enter the name for the item: ");
        this.itemName = sc.next();
        System.out.println("Enter the quantity for the item: ");
        this.quantityInStock= sc.nextInt();
        System.out.println("Enter the cost of the item: ");
        this.itemCost = sc.nextInt();
        System.out.println("Enter the sales price of the item: ");
        this.itemPrice= sc.nextInt();
        FoodItem obj = new FoodItem(this.getItemCode(),this.getItemName(),this.itemPrice,this.quantityInStock,this.itemCost);
        return obj;
    }
}

