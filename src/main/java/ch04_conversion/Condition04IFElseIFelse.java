package ch04_conversion;

import java.util.Scanner;

public class Condition04IFElseIFelse {
    public static void main(String[] args) {
        /*
        if - else if - esle문
        형식:
        if (조건식1)
        실행문1
        }else if (조건식2){
        실행문2
        }elseif (조건식3) {
                실행문3
        }else{
        실행문 4
         */
        Scanner scanner = new Scanner(System.in);
        int point;
        // 상수 개념을 처음 설명합니다 => 예는 기초화가 필수
        final int ViP_POINT = 100; // fainal 키워드가 붙으면 '재대입'이 불가능 0개의 상용위치
        final int GOLD_POINT = 80; //즉 . 변함없는 데이터를 서용하고 싶을 떄 0개의 사용위치
        final int SILVER_POINT = 60; // 사용하는데 얘가 변함없는 데이터임을 0개의 사용위치
        final int BRONZE_POINT = 40; // 개발자들이 알아보기 위해 0개의 사용위치
        // 어제말한 snake_case를 활용하여 대문자로만 작성합니다 . 띄어쓰기는 '_' 사용.
        System.out.println("포인트를 입력하세요 >>>");
        point = scanner.nextInt(); // 여기서 초기화가 이루어지겠네요.
        String userGrade;
        if (point > ViP_POINT) {
            userGrade = "VIP";
        } else if (point > GOLD_POINT) {
            userGrade = "GOLD";
        } else if (point > SILVER_POINT) {
            userGrade = "SILVER";
        } else if (point > BRONZE_POINT) {
            userGrade = "BRONZE";
            System.out.println("회원등급 : " + userGrade);
        }else{
            userGrade = "GENERAL";
        }
    }
}
