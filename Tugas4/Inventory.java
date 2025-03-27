package Tugas4;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T> {
    private List<T> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        if (item != null) {
            items.add(item);
        }
    }

    public boolean removeItem(T item) {
        return items.remove(item);
    }

    public List<T> getItems() {
        return new ArrayList<>(items);
    }

    public List<T> searchItem(String keyword) {
        List<T> searched = new ArrayList<>();
        for(T item: items) {
            if(item.toString().toLowerCase().contains(keyword.toLowerCase())) {
                searched.add(item);
            }
        }
        return searched;
    }
}