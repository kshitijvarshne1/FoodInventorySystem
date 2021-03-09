/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Mar-21
 *   Time: 3:54 PM
 *   File: Vegetables.java
 */

package base_class;

import java.util.ArrayList;

public class Vegetables {
    private String farmName;

    public Vegetables(String farmName) {
        this.farmName = farmName;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "farmName='" + farmName + '\'' +
                '}';
    }
    public boolean addItem(Vegetables vegetable){
        ArrayList<Vegetables> vegetablesGodown= new ArrayList<>();
        vegetablesGodown.add(vegetable);
        return true;
    }

}

