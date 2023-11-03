package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.service.EmployeeService;

import java.util.Scanner;

public class EmployeeView {

    public void displayView() {

        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();



        do{
            System.out.println("================직원 관리 ====================");
            System.out.println("1. 직원전체조회");
            System.out.println("2. 직원 이름 또는 id로 직원조회");
            System.out.println("3. 부서명으로 검색");
            System.out.println("4. 직급으로 검색");
            System.out.println("5. 신규 부서 생성");
            System.out.println("6. 신규 직원 생성");
            System.out.println("7. 직원 정보 변경(이름, 전화번호, 이메일,부서, 직급)");
            System.out.println("8. 직원퇴사");
            System.out.println("==========================================");
            System.out.print("직원관리 번호를 입력하세요.");


            int no  = sc.nextInt();

            switch (no){
                case 1 : employeeService.selectAllEmployee();break;
                case 2 : selectEmployee();break;
                case 3 : break;
                case 4 : break;
                case 5 : break;
                case 6 : break;
                case 7 : break;
                case 8 : break;
            }

        } while (true);

        /*
        ============ 직원 관리 ====================
        1. 직원전체조회
        2. 직원 이름 또는 id로 직원조회
        3. 부서명으로 검색
        4. 직급으로 검색
        5. 신규 부서 생성
        6. 신규 직원 생성
        7. 직원 정보 변경(이름, 전화번호, 이메일,부서, 직급)
        8. 직원퇴사
        ==========================================
        상세 내용은 pdf를 참고
        */
    }

    private static void selectEmployee() {
        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();
        do{
            System.out.println("============직원 조회==========");
            System.out.println("1. 직원 이름으로 직원조회");
            System.out.println("1. 직원 id로 직원조회");
            System.out.println("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : employeeService.selectEmployeeByName();break;
                case 2 : break;
            }
        }
    }
}
