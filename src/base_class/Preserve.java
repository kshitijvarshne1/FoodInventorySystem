/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-Mar-21
 *   Time: 12:03 AM
 *   File: Preserve.java
 */

package base_class;

import java.util.Objects;
import java.util.Scanner;

public class Preserve extends FoodItem {
    private int jarSize;

    public Preserve(int itemCode, String itemName, float itemPrice, int quantityInStock, float itemCost, int jarSize) {
        super(itemCode, itemName, itemPrice, quantityInStock, itemCost);
        this.jarSize = jarSize;
    }

    public Preserve(int jarSize) {
        this.jarSize = jarSize;
    }
    public Preserve() {
        this.jarSize = 0;
    }

    public int getJarSize() {
        return jarSize;
    }

    public void setJarSize(int jarSize) {
        this.jarSize = jarSize;
    }

    @Override
    public String toString() {
        return super.toString()+
                " jarSize= " + jarSize+ " ml "+" }";
    }
    public Preserve additem(FoodItem obj){
        System.out.println("Enter the size of the jar in millilitres: ");
        Scanner sc= new Scanner(System.in);
        this.jarSize = sc.nextInt();
        Preserve p = new Preserve(obj.getItemCode(),obj.getItemName(),obj.getItemPrice(),obj.getQuantityInStock(),obj.getItemCost(),this.getJarSize());
        return p;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Preserve preserve = (Preserve) o;
        return getJarSize() == preserve.getJarSize();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJarSize());
    }
}

