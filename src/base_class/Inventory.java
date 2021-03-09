/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Mar-21
 *   Time: 10:25 PM
 *   File: Inventory.java
 */

package base_class;

import java.util.ArrayList;

public class Inventory {
    ArrayList godown= new ArrayList();

    public Inventory() {
    }
    public void addItem(FruitItem f){
        godown.add(f);
    }

    public void addItem(Preserve p){
        godown.add(p);
    }
    public void addItem(Sweeteners s){
        godown.add(s);
    }
    public void addItem(Vegetables v){
        godown.add(v);
    }
    public void print(){
        for (Object o : godown) {
            System.out.println(o);
        }
    }

}

