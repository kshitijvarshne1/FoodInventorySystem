/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Mar-21
 *   Time: 4:01 PM
 *   File: FruitItem.java
 */

package base_class;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitItem extends FoodItem {
    private String orchardname;

    public FruitItem(int itemCode, String itemName, float itemPrice, int quantityInStock, float itemCost, String orchardname) {
        super(itemCode, itemName, itemPrice, quantityInStock, itemCost);
        this.orchardname = orchardname;
    }

    public FruitItem(String orchardname) {
        this.orchardname = orchardname;
    }
    public FruitItem() {
        this.orchardname = null;
    }

    public String getOrchardname() {
        return orchardname;
    }

    public void setOrchardname(String orchardname) {
        this.orchardname = orchardname;
    }

    @Override
    public String toString() {
        return super.toString()+" orchardname= " + orchardname + " }";
    }

    public FruitItem addItem(FoodItem obj){
        System.out.println("Enter the name of the orchard supplier: ");
        Scanner sc= new Scanner(System.in);
        this.orchardname = sc.nextLine();
        FruitItem ftBucket = new FruitItem(obj.getItemCode(),obj.getItemName(),obj.getItemPrice(),obj.getQuantityInStock(),obj.getItemCost(),this.orchardname);
        return ftBucket;
    }
}