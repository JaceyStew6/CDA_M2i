package org.example.model;

public class Item {

    private int itemId;

    private static int nbItem = 0;

    public Item() {
        this.itemId = ++nbItem;
    }

    @Override
    public String toString() {
        return "itemId=" + itemId;
    }
}
