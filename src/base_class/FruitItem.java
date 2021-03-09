/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Mar-21
 *   Time: 4:01 PM
 *   File: FruitItem.java
 */

package base_class;

import java.util.ArrayList;

public class FruitItem extends FoodItem {
    private String OrchardName;

    public FruitItem(String orchardName) {
        super();
        OrchardName = orchardName;
    }

    public String getOrchardName() {
        return OrchardName;
    }

    public void setOrchardName(String orchardName) {
        OrchardName = orchardName;
    }

    @Override
    public String toString() {
        return "FruitItem{" +
                "OrchardName='" + OrchardName + '\'' +
                '}';
    }
    public boolean addItem(FruitItem fruitItem){
        ArrayList<FruitItem> fruititems = new ArrayList<>();
        if(fruititems.contains(fruitItem)){
            return false;
        }
        else{
            fruititems.add(fruitItem);
            return true;
        }
    }
}