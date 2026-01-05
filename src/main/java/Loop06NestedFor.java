import java.util.Scanner;

public class Loop06NestedFor {
    public static void main(String[] args) {

        /*
        중첩 for 문도 가능합니다
     for (int i = 0 ; i < 100 ; i++){
     반복실행문1-a
     for (int j = 0 ; j < 100 ; j++){
     반복실행문2
     }
     반복실행문1-b
     }

     for 문을 활용하여 1일차 1교시입니다 . ~ 5일차 3교시 입니다 까지 출력하시오
     다하면 구구단for 문으로 출력하시오.


         */
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.println(i + "일차 " + j + "교시입니다");
                System.out.println();
                for (int k = 1; k < 101; k++) {
                    System.out.println(i + " "); //반복실행문
                    if (k % 10 == 0) {
                        System.out.println();
                    }
                }


        /*
        숫자를 입력 받아서 홀수만 더하는 for 반복문을 작성하시오.
        다 했으면 짝수는 구하는 for 반복문을 작성하시오.
        1부터 몇 까지 더하시겠습니까? >>> 10
        1부터 10까지 중 홀수의 합은 n 입니다
        1부터 10까지 중 짝수의 합은 n 입니다
           */
                Scanner scanner = new Scanner(System.in);
                System.out.println("1 부터 몇 까지 더하시겠습니까? >>>");
                int n = scanner.nextInt();
                int sumEven = 0;
                int sumOdd = 0;
                int sum = 0;
//        for(int i = 1 ; o < (n+1) : i+++){
//            if (i % 2 == 0){
//                sumEven += i;
//            }else{
//                sumOdd += i;
//            }
//        }
                System.out.println("1부터 " + n + "까지 중 홀수의 합은 " + sumOdd);
                System.out.println();


            }
        }

    }
}