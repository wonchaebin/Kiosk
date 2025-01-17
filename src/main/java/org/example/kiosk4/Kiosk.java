package org.example.kiosk4;

import java.util.List;
import java.util.Scanner;


        //생성자
        public class Kiosk {
            private List<Menu> menus;

            public Kiosk(List<Menu> menus) {
                this.menus = menus;
            }

            //키오스크 실행 메서드
            public void start() {
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    //메인 메뉴 출력
                    System.out.println("[ MAIN MENU ]");

                    int index = 1;
                    for (Menu menu : menus) {
                        System.out.println(index + ". " + menu.getName());
                        index++;
                    }
                    System.out.println("0. 종료");

                    //사용자의 입력 받기
                    System.out.print("선텍 : ");
                    int choice = scanner.nextInt();

                    if (choice == 0) {
                        System.out.println("시스템을 종료합니다.");
                        break;
                    } else if (choice > 0 && choice <= menus.size()) {
                        //선택한 숫자가 0보다 크고 전체 메뉴의 개수 이하인지 확인하여 선택한 메뉴 출력
                        menus.get(choice - 1).displayItems();

                        //서브 메뉴에서 사용자 입력 처리
                        subMenu(scanner, menus.get(choice - 1));
                    } else {
                        System.out.println("올바른 번호를 입력하세요.");
                    }

                }
            }

            private void subMenu(Scanner scanner, Menu menu) {
                while (true) {
                    System.out.println("\n[ " + menu.getName() + " MENU ]");
                    menu.displayItems();
                    System.out.println("0. 뒤로가기");

                    System.out.print("선택 : ");
                    int subChoice = scanner.nextInt();

                    if (subChoice == 0) {
                        break;
                    } else if (subChoice > 0 && subChoice <= menu.getMenuItems().size()) {
                        MenuItem selectedItem = menu.getMenuItems().get(subChoice - 1);
                        System.out.println("선택한 메뉴 : " + selectedItem.getName() + "|" + selectedItem.getDescription() + "|" + selectedItem.getPrice() + "|" + selectedItem.getDescription());
                    } else {
                        System.out.println("올바른 번호를 입력하세요.");
                    }
                }
            }
        }

