package org.example.kiosk4;



import java.util.ArrayList;
import java.util.List;


public class Menu {
    private String name;
    private List<MenuItem> menuItems;

    public Menu(String name) {
        this.name = name;
        this.menuItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }
    public void displayItems() {
        int index = 1;
        for (MenuItem item : menuItems) {
            System.out.println(index + ". " + item.getName() + " | " + item.getPrice() + " | " + item.getDescription());
            index++;
        }
    }
}
