/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-Mar-21
 *   Time: 12:01 AM
 *   File: Main.java
 */

package main_class;

import base_class.FoodItem;
import base_class.FruitItem;
import base_class.Vegetables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        show();
        int input = sc.nextInt();
        while (input != 6) {
            switch (input) {
                case 1:
                    System.out.println("Do you wish to add a fruit(f), vegetable(v) or a preserve(p) ?");
                    char choice = sc.next().charAt(0);
                    switch (choice) {
                        case 'f':
                            FruitItem ft= new FruitItem();
                            FruitItem resultFruit = ft.addItem();
                            break;
                        case 'v':
                            Vegetables veg = new Vegetables();
                            Vegetables resultVegetable = veg.addItem();
                            break;
                        case 'p':
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                default:
                    break;
            }
            show();
            input = sc.nextInt();

        }

    }

    private static void show() {
        System.out.println("Please select one of the following:\n" +
                "1: Add Item to Inventory\n" +
                "2: Display Current Inventory\n" +
                "3: Buy Item(s)\n" +
                "4: Sell Item(s)\n" +
                "5: Convert ArrayList to Linkedlist and print it.\n" +
                "6. To Exit");
    }
}

