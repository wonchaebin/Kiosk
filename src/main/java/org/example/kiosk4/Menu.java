package org.example.kiosk4;



import java.util.ArrayList;
import java.util.List;

//메뉴 클래스 : 메뉴 이름과 메뉴 항목들을 관리
public class Menu {
    private String name; //메뉴 이름
    private List<MenuItem> menuItems; //메뉴 항목 리스트

    //생성자
    public Menu(String name) {
        this.name = name;
        this.menuItems = new ArrayList<>();
    }

    //Getter : 메뉴 이름 반환
    public String getName() {
        return name;
    }

    //Getter : 메뉴 항목 리스트 반환
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    //메뉴 항목 추가 메서드
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    //메뉴 항목 출력 메서드
    public void displayItems() {
        int index = 1;
        for (MenuItem item : menuItems) {
            System.out.println(index + ". " + item.getName() + " | " + item.getPrice() + " | " + item.getDescription());
            index++;
        }
    }
}
