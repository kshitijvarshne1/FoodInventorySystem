/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-Mar-21
 *   Time: 1:01 AM
 *   File: Sweeteners.java
 */

package base_class;

import java.util.Scanner;

public class Sweeteners extends FoodItem{
    private String foodProcessingPlant;

    public Sweeteners(int itemCode, String itemName, float itemPrice, int quantityInStock, float itemCost, String foodProcessingPlant) {
        super(itemCode, itemName, itemPrice, quantityInStock, itemCost);
        this.foodProcessingPlant = foodProcessingPlant;
    }

    public Sweeteners(String foodProcessingPlant) {
        this.foodProcessingPlant = foodProcessingPlant;
    }
    public Sweeteners() {
        this.foodProcessingPlant = null;
    }

    @Override
    public String toString() {
        return super.toString()+" Sweeteners{" +
                "foodProcessingPlant='" + foodProcessingPlant + '\'' +
                '}';
    }

    public String getFoodProcessingPlant() {
        return foodProcessingPlant;
    }

    public void setFoodProcessingPlant(String foodProcessingPlant) {
        this.foodProcessingPlant = foodProcessingPlant;
    }

    public Sweeteners additem(){
        FoodItem obj =super.addItem();
        System.out.println("Enter the name of the Food Processing Plant: ");
        Scanner sc= new Scanner(System.in);
        this.foodProcessingPlant = sc.nextLine();
        Sweeteners s = new Sweeteners(obj.getItemCode(),obj.getItemName(),obj.getItemPrice(),obj.getQuantityInStock(),obj.getItemCost(),this.getFoodProcessingPlant());
        return s;
    }
}

