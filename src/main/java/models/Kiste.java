package models;

import java.util.ArrayList;
import java.util.List;

public class Kiste {
    private List<Item> items;

    public Kiste() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
