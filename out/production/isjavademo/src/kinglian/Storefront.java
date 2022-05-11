package kinglian;

import java.util.*;

class Storefront {
    private LinkedList<Item> catalog = new LinkedList<Item>();

    void addItem(String id, String name, String price, String quant) {
        Item it = new Item(id, name, price, quant);
        catalog.add(it);
    }

    Item getItem(int i) {
        return (Item) catalog.get(i);
    }

    int getSize() {
        return catalog.size();
    }

    void sort() {
        Collections.sort(catalog);
    }

}

