package ru.roon.cinema;

public abstract class ItemMenu {
    private int number;
    private String description;

    public ItemMenu(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public abstract void doSomething();

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }
}
