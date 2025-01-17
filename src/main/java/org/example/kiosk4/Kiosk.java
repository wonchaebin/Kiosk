package org.example.kiosk4;

import java.util.List;
import java.util.Scanner;


        //생성자
        public class Kiosk {
            //메뉴 목록을 저장하는 필드
            private List<Menu> menus;

            //생성자 : Kiosk 객체를 생성할 때 메뉴 목록 받아옴
            public Kiosk(List<Menu> menus) {
                this.menus = menus;
            }

            //키오스크 실행 메서드
            public void start() {
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    //메인 메뉴 출력
                    System.out.println("[ MAIN MENU ]");

                    //메뉴 목록 출력
                    int index = 1; //메뉴 번호 1부터 시작
                    for (Menu menu : menus) {
                        System.out.println(index + ". " + menu.getName()); //메뉴 이름 출력
                        index++;
                    }
                    System.out.println("0. 종료"); //종료 옵션

                    //사용자가 선택한 메뉴 번호 입력 받기
                    System.out.print("선택 : ");
                    int choice = scanner.nextInt();

                    if (choice == 0) { //0 입력 시 종료
                        System.out.println("시스템을 종료합니다.");
                        break; //무한루프 종료

                        // 선택한 숫자가 0보다 크고 전체 메뉴의 개수 이하인지 확인하여 선택한 메뉴 출력
                    } else if (choice > 0 && choice <= menus.size()) {
                        //선택한 메뉴에 대한 세부 정보 출력
                        Menu selectedMenu = menus.get(choice - 1); //메뉴 리스트에서 선택한 메뉴 가져오기
                        System.out.println("[ "+selectedMenu.getName()+" MENU ]");
                        selectedMenu.displayItems(); //메뉴 항목들 출력

                        //서브 메뉴로 이동
                        subMenu(scanner, selectedMenu);

                    } else {
                        System.out.println("올바른 번호를 입력하세요."); //잘못된 번호 입력 시
                    }
                }
            }

            //서브 메뉴를 처리하는 메서드(메뉴 항목 선택하는 부분)
            private void subMenu(Scanner scanner, Menu menu) {
                while (true) {
                    System.out.println("0. 뒤로가기"); //뒤로가기 옵션
                    System.out.print("선택 : ");
                    int subChoice = scanner.nextInt(); //서브 메뉴에서 사용자 선택을 받음

                    if (subChoice == 0) { //0 입력 시 서브 메뉴에서 나가고 메인 메뉴로 돌아감
                        break;
                    } else if (subChoice > 0 && subChoice <= menu.getMenuItems().size()) { //선택한 메뉴 항목 세부 정보 출력
                        //메뉴 항목 가져오기
                        MenuItem selectedItem = menu.getMenuItems().get(subChoice - 1);
                        System.out.println("선택한 메뉴 : " + selectedItem.getName() + " | " + selectedItem.getDescription() + " | " + selectedItem.getPrice() + " | " + selectedItem.getDescription());
                    } else {
                        System.out.println("올바른 번호를 입력하세요."); //잘못된 번호 입력 시
                    }
                }
            }
        }

