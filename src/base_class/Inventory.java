/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Mar-21
 *   Time: 10:25 PM
 *   File: Inventory.java
 */

package base_class;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Inventory {
    ArrayList godown = new ArrayList();

    public Inventory() {
    }

    public void addItem(FruitItem f) {
        godown.add(f);
    }

    public void addItem(Preserve p) {
        godown.add(p);
    }

    public void addItem(Sweeteners s) {
        godown.add(s);
    }

    public void addItem(Vegetables v) {
        godown.add(v);
    }

    public void print() {
        for (Object o : godown) {
            System.out.println(o);
        }
    }

    public boolean addInputItem(char check) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code for the item: ");
        int itemCode = sc.nextInt();
        FoodItem result = null;
        for (Object o : godown) {
            if (((FoodItem) o).getItemCode() == itemCode) {
                return false;
            }
        }
        FoodItem ft = new FoodItem();
        FoodItem fi = ft.addItem(itemCode);
        if (check == 'f') {
            FruitItem finalFruit = new FruitItem();
            addItem(finalFruit.addItem(fi));

        }
        else if (check == 'v') {
            Vegetables finalVegetable = new Vegetables();
            addItem(finalVegetable.addItem(fi));

        } else if(check=='p'){
            Preserve p= new Preserve();
            addItem(p.additem(fi));
        }
        else{
            Sweeteners s= new Sweeteners();
            addItem(s.additem(fi));
        }
        return true;

    }

    public void buyItem() {
        System.out.println("Enter valid item code: ");
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        boolean response = false;
        FoodItem result = null;
        for (Object o : godown) {
            if (((FoodItem) o).getItemCode() == code) {
                result = (FoodItem) o;
                response = true;
            }
        }
        if (response) {
            System.out.println("Enter valid quantity to buy: ");
            int quantity = sc.nextInt();
            if (quantity >= 1 && result.getQuantityInStock() >= quantity) {
                int old = result.getQuantityInStock();
                result.setQuantityInStock(old + quantity);
                System.out.println("Item buyed");
            } else {
                System.out.println("Invalid quantity...\n" +
                        "Error...could not buy item");
            }
        } else {
            System.out.println("Code not found in inventory...\n" +
                    "Error...could not buy item");
        }
    }

    public void printLL() {
        LinkedList ll = new LinkedList();
        for (Object o : godown) {
            ll.add(o);
        }
        for (Object o : ll) {
            System.out.print(o + " -> ");
        }
        System.out.println();
    }

    public void sellitem() {
        System.out.println("Enter valid item code: ");
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        boolean response = false;
        FoodItem result = null;
        for (Object o : godown) {
            if (((FoodItem) o).getItemCode() == code) {
                result = (FoodItem) o;
                response = true;
            }
        }
        if (response) {
            System.out.println("Enter valid quantity to sell: ");
            int quantity = sc.nextInt();
            if (quantity <= 0) {
                System.out.println("Invalid quantity...\n" +
                        "Error...could not sell item");
            } else if (result.getQuantityInStock() >= quantity) {
                int old = result.getQuantityInStock();
                result.setQuantityInStock(old - quantity);
                System.out.println("Item buyed");
            } else {
                System.out.println("Insufficient stock in inventory...\n" +
                        "Error...could not sell item");
            }
        } else {
            System.out.println("Code not found in inventory...\n" +
                    "Error...could not buy item");
        }
    }

}

