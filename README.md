# CH2 키오스크 과제

## 1. 키오스크 Lv1.
### 🔎기능
#### 햄버거 메뉴 출력 및 선택
- Scanner를 사용하여 여러 햄버거 메뉴 출력
- 제시된 메뉴 중 입력받은 숫자에 따라 다른 로직 실행
- 반복문 이용해 특정 번호(0) 입력 시 프로그램 종료

### ✔️기능 설명

- 콘솔창에 여러 햄버거 메뉴 출력
  
![image](https://github.com/user-attachments/assets/f293f601-8b3f-4a9a-8578-2c811e29ff72)


- 입력받은 숫자에 따라 다른 로직 실행
  
![image](https://github.com/user-attachments/assets/67fca870-53c5-44f3-a80f-e69edda69d9d)

- 반복문 이용하여 특정 숫자(0) 입력 전 까지 프로그램 반복

![image](https://github.com/user-attachments/assets/e145789a-e2f3-492f-b98f-5258cc583410)

- 특정 숫자(0) 입력 시 프로그램 종료

![image](https://github.com/user-attachments/assets/88028d2c-9d47-4678-9cbe-0b71caf53dc6)


## 2. 키오스크 Lv2.
### 🔎기능
#### 객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리
- MenuItem 클래스 생성(이름, 가격, 설명 필드)
- main 함수에서 MenuItem 클래스 활용하여 햄버거 메뉴 출력
- 반복문 활용해 List 안에 있는 MenuItem 하나씩 출력하고 사용자가 입력한 숫자에 따라 다른 로직 실행

### ✔️기능 설명

- MenuItem 클래스 활용한 햄버거 메뉴 출력(이름, 가격, 설명)

![image](https://github.com/user-attachments/assets/ac77a424-d8a5-4607-95e5-593c03975077)

- 사용자가 입력한 숫자에 따라 다른 로직 실행

![image](https://github.com/user-attachments/assets/0f49f2a2-3142-4f2e-81af-b840feee68de)

- 반복문 시행 / 특정 숫자(0) 입력 시 프로그램 종료

![image](https://github.com/user-attachments/assets/8640d923-e06d-48db-9f06-1f97d676a702)


## 3. 키오스크 Lv3.
### 🔎기능
#### 객체 지향 설계를 적용해 순서 제어를 클래스로 관리
- Kiosk 클래스 생성(프로그램의 메뉴 관리 및 사용자 입력 처리하는 클래스)
- 입력과 반복문 로직 start 함수 생성하여 관리
- 사용자의 입력을 받아 메뉴 선택하거나 프로그램 종료
- 유효하지 않은 입력에 대해 오류메세지 출력
- 0을 입력하면 프로그램 '뒤로가기' 되거나 '종료'

### ✔️기능 설명

- 뒤로가기 또는 종료 옵션 추가

![image](https://github.com/user-attachments/assets/a0433e7d-83ee-489a-b7c3-8da379bf257f)


- 사용자의 입력을 받아 메뉴 선택 시 메뉴 이름, 가격, 설명 출력

![image](https://github.com/user-attachments/assets/692c80f1-1a45-4514-a795-4236279575a9)


- 0을 입력하면 뒤로가기/종료 옵션 출력됨. 이후 사용자가 뒤로가기 선택 시 메뉴 선택 창 출력

![image](https://github.com/user-attachments/assets/d8ce620f-3707-4661-9d17-89683384a8b4)

- 위와 같은 방식으로 사용자가 종료 선택 시 프로그램 종료

![image](https://github.com/user-attachments/assets/c02ce4cf-13e8-4bfe-936e-d00cb20e0046)



