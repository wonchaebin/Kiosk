package org.example.kiosk5;



import java.util.ArrayList;
import java.util.List;

//메뉴 클래스 : 메뉴 이름과 메뉴 항목들을 관리
public class Menu {
    //필드
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
        menuItems.add(item); //리스트에 메뉴 항목 추가
    }

    //메뉴 항목 출력 메서드
    public void displayItems() {
        int index = 1; //항목 번호를 1부터 시작
        for (MenuItem item : menuItems) {
            //각 메뉴 항목의 이름, 가격, 설명 출력
            System.out.println(index + ". " + item.getName() + " | " + item.getPrice() + " | " + item.getDescription());
            index++; //번호 증가
        }
    }
}
