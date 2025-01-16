package org.example.kiosk3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("키오스크가 시작됩니다.");
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger");
            System.out.println("2. SmokeShack");
            System.out.println("3. Cheeseburger");
            System.out.println("4. Hamburger");
            System.out.println("0. 뒤로가기 또는 종료");

            System.out.print("원하시는 메뉴를 선택하세요. : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(menuItems.get(0));
                    break;
                case 2:
                    System.out.println(menuItems.get(1));
                    break;
                case 3:
                    System.out.println(menuItems.get(2));
                    break;
                case 4:
                    System.out.println(menuItems.get(3));
                    break;
                case 0:
                    if (choiceBackorExit(scanner)) {
                        System.out.println("시스템이 종료됩니다.");
                        return;
                    }
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    break;

            }
        } while (choice != 0);
    }

    private boolean choiceBackorExit(Scanner scanner) {
        System.out.println("1. 뒤로가기");
        System.out.println("2. 종료");
        System.out.print("선택 : ");
        int subChoice = scanner.nextInt();
        if (subChoice == 1) {
            System.out.println("메뉴로 돌아갑니다.");
            return false;
        } else if (subChoice == 2) {
            return true;
        } else {
            System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            return choiceBackorExit(scanner);
        }
    }
}