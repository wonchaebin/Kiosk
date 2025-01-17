package org.example.kiosk3;

public class MenuItem {

    //필드에 이름, 가격, 설명 저장
    private String name;
    private double price;
    private String description;

    //생성자 : MenuItem 객체 생성 시 메뉴 이름, 가격, 설명 설정
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //객체 출력 시 사용되는 메서드(메뉴 이름, 가격, 설명 출력)
    @Override
    public String toString() {
        return "메뉴이름 : " + name + ", 가격 : " + price + "원, 설명 : " + description;
    }

    //메뉴 이름 반환하는 getter 메서드
    public String getName() {
        return name;
    }

    //메뉴 가격 반환하는 getter 메서드
    public double getPrice() {
        return price;
    }

    //메뉴 설명 반환하는 getter 메서드
    public String getDescription() {
        return description;
    }
}
