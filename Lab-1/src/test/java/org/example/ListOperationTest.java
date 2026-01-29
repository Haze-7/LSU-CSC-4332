package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ListOperationTest {

    @org.junit.jupiter.api.Test
    void addItem() {
        ListOperation listOperation = new ListOperation();

        // Breaks rule: string length must be < 15
        listOperation.addItem("this_string_is_definitely_too_long");

        // Breaks rule: list must not exceed 10 elements
        for (int i = 0; i < 10; i++) {
            listOperation.addItem("item" + i);
        }

        // Expected behavior according to specification:
        // - long string should NOT be added
        // - list size should be capped at 10
        assertEquals(10, listOperation.items.size(),
                "List should not allow more than 10 items and reject long strings");
    }

    @org.junit.jupiter.api.Test
    void getItemsByRange() {
        ListOperation listOperation = new ListOperation();

        listOperation.items.add("A");
        listOperation.items.add("B");
        listOperation.items.add("C");
        listOperation.items.add("D");

        // Range is exclusive (1,3) → should only return "C"
        var result = listOperation.getItemsByRange(1, 3);

        assertEquals(1, result.size(),
                "Range should be exclusive");
        assertEquals("C", result.get(0));
    }

    @org.junit.jupiter.api.Test
    void removeItem() {
        ListOperation listOperation = new ListOperation();

        // Use different String objects with same value
        listOperation.items.add(new String("Apple"));
        listOperation.items.add("Banana");

        boolean removed = listOperation.removeItem(new String("Apple"));

        // Expected: value-based removal
        assertTrue(removed,
                "removeItem should return true when an item is removed");
        assertFalse(listOperation.items.contains("Apple"),
                "Item should be removed using value equality");
    }
}
