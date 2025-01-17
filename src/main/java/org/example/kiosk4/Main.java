package org.example.kiosk4;


import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            Menu burgers = new Menu("Burgers");
            burgers.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
            burgers.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소가 토핑된 치즈버거"));
            burgers.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
            burgers.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

            Menu drinks = new Menu("Drinks");
            drinks.addMenuItem(new MenuItem("Coke",2.0,"얼음컵과 함께 제공되는 코카콜라"));
            drinks.addMenuItem(new MenuItem("Iced Tea",3.5,"설탕이나 시럽이 들어가지 않는 차가운 홍차"));
            drinks.addMenuItem(new MenuItem("Chocolate Shake",4.5,"감자튀김과 잘 어울리는 진한 초코쉐이크"));

            Menu desserts = new Menu("Desserts");
            desserts.addMenuItem(new MenuItem("Ice Cream", 3.0, "달콤한 바닐라 아이스크림"));
            desserts.addMenuItem(new MenuItem("Churros", 3.5, "달콤한 초코시럽과 함께 찍어 먹는 바삭바삭 츄러스"));
            desserts.addMenuItem(new MenuItem("Pudding", 3.0, "바닐라빈이 잔뜩 들어간 달콤한 푸딩"));

            List<Menu> menus = new ArrayList<>();
            menus.add(burgers);
            menus.add(drinks);
            menus.add(desserts);

            Kiosk kiosk = new Kiosk(menus);
            kiosk.start();
        }
    }

