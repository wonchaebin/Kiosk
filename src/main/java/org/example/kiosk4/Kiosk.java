package org.example.kiosk4;

import java.util.List;
import java.util.Scanner;

    public class Kiosk {
        private List<Menu> menus;

        public Kiosk(List<Menu> menus) {
            this.menus = menus;
        }
        public void start() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("[ MAIN MENU ]");

                int index = 1;
                for (Menu menu : menus) {
                    System.out.println(index + ". " + menu.getName());
                    index++;
                }
                System.out.println("0. 종료");
                System.out.print("선텍 : ");
                int choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;

                }else if (choice == 1) {}

            }
        }
    }

