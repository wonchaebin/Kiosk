package org.example.kiosk3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //메뉴 항목을 담는 리스트
    private List<MenuItem> menuItems;

    //생성자 : Kiosk 객체가 생성될 떄 MenuItem 리스트 받아옴
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    //키오스크 실행하는 메서드
    public void start() {
        //사용자의 입력 받기 위한 Scanner 객체
        Scanner scanner = new Scanner(System.in);
        //사용자의 메뉴 선택 저장하는 변수
        int choice;

        //do-while문으로 메뉴 선택 계속 반복
        do {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger");
            System.out.println("2. SmokeShack");
            System.out.println("3. Cheeseburger");
            System.out.println("4. Hamburger");
            System.out.println("0. 뒤로가기 또는 종료");

            //사용자에게 번호 입력 받음
            System.out.print("원하시는 메뉴를 선택하세요. : ");
            choice = scanner.nextInt();

            //switch문으로 사용자가 입력한 메뉴에 대한 처리
            switch (choice) {
                case 1: //ShackBurger 실행(컴퓨터는 0이 첫 번째 수이기 때문에 0부터 입력)
                    System.out.println(menuItems.get(0));
                    break;
                case 2: //SmokeShack 실행
                    System.out.println(menuItems.get(1));
                    break;
                case 3: //Cheeseburger 실행
                    System.out.println(menuItems.get(2));
                    break;
                case 4: //Hamburger 실행
                    System.out.println(menuItems.get(3));
                    break;
                case 0: //뒤로가기 또는 종료 실행
                    if (choiceBackorExit(scanner)) { //뒤로가기 또는 종료 선택 메서드 호출
                        System.out.println("시스템이 종료됩니다."); //종료 메세지 출력
                        return;
                    }
                    break;
                default: //잘못된 입력 처리
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    break;

            }
        } while (true); //메뉴를 계속 보여주는 무한루프
    }

    //뒤로 가기 또는 종료를 선택하는 메서드(boolean으로 true or false)
    private boolean choiceBackorExit(Scanner scanner) {

        //뒤로 가기 or 종료 옵션 선택
        System.out.println("1. 뒤로가기");
        System.out.println("2. 종료");
        System.out.print("선택 : ");
        int subChoice = scanner.nextInt();

        if (subChoice == 1) { //뒤로가기
            System.out.println("메뉴로 돌아갑니다.");
            return false; //메뉴로 돌아가기 위해 false
        } else if (subChoice == 2) { //종료
            return true; //시스템 종료 위해 true
        } else { //잘못되 입력 처리
            System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            return choiceBackorExit(scanner); //다시 호출
        }
    }
}