package org.example.kiosk3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //MenuItem 객체 담을 리스트 생성
        List<MenuItem> items = new ArrayList<>();

        //메뉴 항목 리스트에 추가
        items.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        items.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소가 토핑된 치즈버거"));
        items.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        items.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        //Kiosk 객체 생성, 메뉴 항목 리스트 전달
        Kiosk kiosk = new Kiosk(items);

        //키오스크 시작
        kiosk.start();
    }
}