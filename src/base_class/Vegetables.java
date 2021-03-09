/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Mar-21
 *   Time: 3:54 PM
 *   File: Vegetables.java
 */

package base_class;

import java.util.ArrayList;
import java.util.Scanner;

public class Vegetables extends FoodItem {
    private String farmName;

    public Vegetables(int itemCode, String itemName, float itemPrice, int quantityInStock, float itemCost, String farmName) {
        super(itemCode, itemName, itemPrice, quantityInStock, itemCost);
        this.farmName = farmName;
    }

    public Vegetables(String farmName) {
        this.farmName = farmName;
    }
    public Vegetables() {
        this.farmName = null;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "farmName='" + farmName + '\'' +
                '}';
    }
    public Vegetables addItem(){
        FoodItem obj =super.addItem();
        System.out.println("Enter the name of the farm supplier: ");
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        Vegetables vegBucket = new Vegetables(obj.getItemCode(),obj.getItemName(),obj.getItemPrice(),obj.getQuantityInStock(),obj.getItemCost(),name);
        return vegBucket;
    }
}

