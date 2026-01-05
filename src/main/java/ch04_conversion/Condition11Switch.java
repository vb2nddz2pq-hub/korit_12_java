package ch04_conversion;

import java.util.Scanner;

public class Condition11Switch {
    public static void main(String[] args) {
        /*
        switch문
        형식 :
        switch(변수명)
        case 조건1:
            실행문1
            break;
        case 조건2:
            실행문2
            break;
        case 조건3:
            실행문3
            break;
        default:
            실행문4;
         */
        Scanner scanner = new Scanner(System.in);


        int choice;

        int selectedNum = 1;
        String selectedChar = "";

        System.out.println(" [ 메뉴 선택 ] ");
        System.out.println("a. 1번 메뉴");
        System.out.println("b. 2번 메뉴");
        System.out.println("c. 3번 메뉴");
        System.out.println("d. 4번 메뉴");
        System.out.println("e. 5번 메뉴");
        System.out.print("메뉴를 선택하세요 >>> ");
//        selectedNum = scanner.nextInt();
        selectedChar = scanner.next();

        // if문으로 메뉴를 선택한다고 가정했을 경우
        if(selectedNum < 1 || selectedNum > 5) {
            System.out.println("불가능한 메뉴 번호입니다.");
        } else {
            if(selectedNum == 1) {
            } else if(selectedNum == 2) {
                System.out.println("메뉴 2를 선택하셨습니다.");
           }

        }


        switch (selectedNum) {
            case 1 :
                System.out.println("메뉴1을 선택하셨습니다.");
                break;
            case 2 :
                System.out.println("메뉴2를 선택하셨습니다.");
                break;
            case 3 :
                System.out.println("메뉴3을 선택하셨습니다.");
                //                break;
            case 4 :
                System.out.println("메뉴4를 선택하셨습니다.");
                break;
            case 5, 6 :
                System.out.println("메뉴5를 선택하셨습니다.");
                break;
            default :
                System.out.println("잘못 선택하셨습니다.");
        }

        switch (selectedChar) {
            case "a" :
                System.out.println("메뉴1을 선택하셨습니다.");
                break;
            case "b" :
                System.out.println("메뉴2를 선택하셨습니다.");
                break;
            case "c" :
                System.out.println("메뉴3을 선택하셨습니다.");
                break;
            case "d" :
                System.out.println("메뉴4를 선택하셨습니다.");
                break;
            case "e" :
                System.out.println("메뉴5를 선택하셨습니다.");
                break;
            default :
                System.out.println("잘못 선택하셨습니다.");
        }


    }
}