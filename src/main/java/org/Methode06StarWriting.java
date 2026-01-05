package org;

import java.util.Scanner;

public class Methode06StarWriting {
    public static void main(String[] args) {
        /*
        // call4() 유형으로 작성할 예정 -> 몇 줄 짜리  별 찍을건지
        //어떤 유형의 별찍기를 할건지  main에서 받을 예정이기 때문에.
        // method 정의  영역
        public static String getSter()

        // method 호출 영역
        // 사용할 객체 생성
         */
//        public static String getSter(int row, int option){
//            // 메서드 내에서만 사용되는 지역 변수 (local Variable) 선언 및 초기화/;
//            String result = "";
//
//            return result;
//
//        }
        Scanner scanner = new Scanner(System.in);
        int rowOfStars = 0; // 몇 줄짜리 만들건지
        int choice = 0; //증강하는 별인지 감소하는 별인지 etc
        String starResult = ""; // 별은 String 자료형이라서 이런식을로 선언 및 초기화

        System.out.println("몇 줄 짜리 별을 생성하시겠습니까? >>>");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증강하는 별");
        System.out.println("1. 오르쪽으로 치우친 증강하는 별");
        System.out.println("1. 왼쪽으로 치우친 감소하는 별");
        System.out.println("1. 오른쪽으로 치우친 감소하는 별");
        System.out.print("어떤 유형의 별을 생성하시겠습니까?>>>");
        choice = scanner.nextInt();
        System.out.println(rowOfStars + " " + choice);
//        starResult = getStar(rowOfStars, choice);
        // getStar()라고 하는 정적 메서드가 있다는 점 (정적 의 의미는 추후 학습)
        // geeStar() 메서드는 매개변수가 있고, return 타입이 있는 call4() 유형이라는 점.
        // - () 내에 변수명이 들어가있다는 점에서, 그리고 그 변수의 자료형까지 고려하면
        // int 타입의 변수가  두 개 요구된다는 점을 파악할 수 있습니다.
        // 또한 getStar() 메서드의 호출 결과가 String 자료형의 starReult에 저장됐다는 점에서
        // return 타입의 String이라는 점도 알 수 있겠네요.

        System.out.println(starResult);
    }

}
