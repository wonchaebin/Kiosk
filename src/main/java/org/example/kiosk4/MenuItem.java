
    package org.example.kiosk4;

    //메뉴 항목 클래스
    public class MenuItem {
        private String name;
        private double price;
        private String description;

        //생성자
        public MenuItem(String name, double price, String description) {
            this.name = name;
            this.price = price;
            this.description = description;
        }

        //메뉴 항목의 정보를 문자열로 반환
        @Override
        public String toString() {
            return "메뉴이름 : " + name + ", 가격 : " + price + "원, 설명 : " + description;
        }

        //Getter : 메뉴 이름 반환
        public String getName() {
            return name;
        }

        //Getter : 메뉴 가격 반환
        public double getPrice() {
            return price;
        }

        //Getter : 메뉴 설명 반환
        public String getDescription() {
            return description;
        }
    }