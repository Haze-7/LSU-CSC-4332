package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListOperation {
    /*
        The in-memory list should not contain more than 10 elements.
     */
    public List<String> items = new ArrayList<String>();

    /*
    Add string to the list. The string length must be less than 15
     */
    public void addItem(String item) {
        items.add(item);
    }

    /*
        remove all the items within the range specified. The range is exclusive.
     */
    public List<String> getItemsByRange(int from, int to) {
        List<String> tempList = new ArrayList<>();
        for(int i=from; i<=to; i++) {
            tempList.add(items.get(i));
        }
        return  tempList;
    }

    /*
        return true if it removes one otherwise false
     */
    public boolean removeItem(String item) {
        boolean removed = false;
        List<String> tempList = new ArrayList<String>();
        for(int i=0; i<items.toArray().length; i++) {
            if(items.get(i) == item) {
                removed = true;
            } else {
                tempList.add(items.get(i));
            }
        }
        items = tempList;
        return removed;
    }
}
