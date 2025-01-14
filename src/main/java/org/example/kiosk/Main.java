package org.example.kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //사용자의 입력을 받기 위한 스캐너 객체 생성
        Scanner in = new Scanner(System.in);
        //사용자가 선택한 메뉴 번호 저장할 변수
        int choice;

        //do-while문으로 반복문 생성
        do {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료      | 종료");

            //사용자에게 메뉴 번호 선택하라는 메세지 출력
            System.out.print("메뉴번호를 선택하세요.: ");

            //사용자로부터 변수를 입력받아 choice 변수에 저장
            choice = in.nextInt();

            //사용자가 입력한 메뉴 번호에 따라 실행할 동작을 switch문으로 생성
            switch (choice) {
                case 1:
                    System.out.println("ShackBurger가 선택되었습니다.");
                    break;
                case 2:
                    System.out.println("SmokeShack이 선택되었습니다.");
                    break;
                case 3:
                    System.out.println("Cheeseburger가 선택되었습니다.");
                    break;
                case 4:
                    System.out.println("Hamburgur가 선택되었습니다.");
                    break;
                case 0:
                    //사용자가 0을 입력할 경우 프로그램 종료 메세지 출력
                    System.out.println("키오스크를 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 1,2,3,4,0 중 하나를 입력하세요.");
                    break;
            }
        } while (choice != 0); //조건 검사를 통해 choice가 0이 아니면 반복문 게속 실행됨
    }
}
