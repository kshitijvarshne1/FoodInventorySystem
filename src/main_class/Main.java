/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-Mar-21
 *   Time: 12:01 AM
 *   File: Main.java
 */

package main_class;

import base_class.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory iv = new Inventory();
        show();
        int input = sc.nextInt();
        while (true) {
            if (input >= 1 && input <= 6) {
                switch (input) {
                    case 1:
                        System.out.println("Do you wish to add a fruit(f), vegetable(v), sweeteners(s) or a preserve(p) ?");
                        char choice = 0;
                        try {
                            choice = sc.next().charAt(0);
                        } catch (Exception e) {
                            System.out.println("Invalid");
                        }
                        if (choice == 'f' || choice == 'v' || choice == 's' || choice == 'p') {
                            switch (choice) {
                                case 'f':
                                    addItemInInventory(iv, choice);
                                    break;
                                case 'v':
                                    addItemInInventory(iv, choice);
                                    break;
                                case 's':
                                    addItemInInventory(iv, choice);
                                    break;
                                case 'p':
                                    addItemInInventory(iv, choice);
                                    break;
                                default:
                                    break;
                            }
                        } else {
                            System.out.println("Invalid");
                        }
                        break;
                    case 2:
                        iv.print();
                        break;
                    case 3:
                        iv.buyItem();
                        break;
                    case 4:
                        iv.sellitem();
                        break;
                    case 5:
                        iv.printLL();
                        break;
                    case 6:
                        System.out.println("Existing.......");
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Invalid");
                System.out.println("please enter correct input 1 - 6");
                show();
                input = sc.nextInt();
            }

        }

    }

    private static void addItemInInventory(Inventory iv, char choice) {
        if (iv.addInputItem(choice)) {
            System.out.println("Add Successfully");
        } else {
            System.out.println("Item code is already");
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

