package ru.roon.cinema;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {

    private List<ItemMenu> items;
    private Map<Integer, ItemMenu> itemsByNumber = new HashMap<>();
    private ItemMenu selectedItem;
    public Menu(List<ItemMenu> items) {
        this.items = items;
        items.forEach(item -> this.itemsByNumber.put(item.getNumber(), item));
    }


    public void printMenu() {
        items.forEach(item -> System.out.println(String.format("%d. %s", item.getNumber(), item.getDescription())));
    }

    public void selectItem(int item) {
        selectedItem = itemsByNumber.get(item);
        if (selectedItem == null) {
            System.out.println("Wrong input!");
            return;
        }
        selectedItem.doSomething();
    }

    public boolean exit() {
        if (selectedItem != null && selectedItem.getNumber() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
