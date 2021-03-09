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

    public void buyItem() {
        System.out.println("Enter valid item code: ");
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        if (godown.contains(new FruitItem().check(code)) || godown.contains(new Preserve().check(code)) || godown.contains(new Preserve().check(code)) ||
                godown.contains(new Vegetables().check(code))) {
            int quantity = sc.nextInt();
            if (quantity >= 1) {
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
    public void printLL(){
        LinkedList ll = new LinkedList();
        for (Object o : godown) {
            ll.add(o);
        }
        for (Object o : ll) {
            System.out.print(o+" -> ");
        }
        System.out.println();
    }
}

