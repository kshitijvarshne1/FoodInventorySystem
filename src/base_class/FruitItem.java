/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Mar-21
 *   Time: 4:01 PM
 *   File: FruitItem.java
 */

package base_class;

public class FruitItem {
    private String OrchardName;

    public FruitItem(String orchardName) {
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
    public void addItem(){

    }
}

