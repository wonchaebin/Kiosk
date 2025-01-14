package org.example.kiosk2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        items.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소가 토핑된 치즈버거"));
        items.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        items.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger");
            System.out.println("2. SmokeShack");
            System.out.println("3. Cheeseburger");
            System.out.println("4. Hamburger");
            System.out.println("0. 종료");

            System.out.print("원하시는 메뉴를 선택하세요. : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("메뉴이름: "+items.get(0).getName() +"\t"+ "가격 : " +items.get(0).getPrice());
                    System.out.println("설명 : "+ items.get(0).getDescription());
                    break;
                case 2:
                    System.out.println("메뉴이름: "+items.get(1).getName() +"\t"+ "가격 : " + items.get(1).getPrice());
                    System.out.println("설명 : "+ items.get(1).getDescription());
                    break;
                case 3:
                    System.out.println("메뉴이름: "+items.get(2).getName() +"\t"+ "가격 : " + items.get(2).getPrice());
                    System.out.println("설명 : "+ items.get(2).getDescription());
                    break;
                case 4:
                    System.out.println("메뉴이름: "+items.get(3).getName() +"\t"+ "가격 : " + items.get(3).getPrice());
                    System.out.println("설명 : "+ items.get(3).getDescription());
                    break;
                case 0:
                    System.out.println("시스템이 종료됩니다.");
                    break;
            }
        } while (choice !=0);
    }
}
