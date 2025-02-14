package org.example.kiosk2;

public class MenuItem {
    private String name; //이름 저장 변수
    private double price; //가격 저장 변수
    private String description; //메뉴 설명 저장 변수

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}