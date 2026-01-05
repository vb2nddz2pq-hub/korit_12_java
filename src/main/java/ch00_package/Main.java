package ch00_package;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*

         2. next (Int / Dobule / Bollean, ... etc) vs. nextLine
         - nextLine()은 띄어쓰기를 허용합니다. enter키를 기준으로 데이터가 변수에 저장됩니다.
        그래서 scanner.nextLine() 으로 사용했을 떄 어제 kim il로 띄어쓰기를 했을 떄 저장이
        가능했습니다
        나머지는 허용이 안됩니다. 그래서 kim 2로 하니까 kim만 저장됐었습니다. 그리고 kim2로
        바꿔 저장했을 떄만 가능했습니다.
        nextLine()이 엔터 키를 기준으로 데이터가 들어간다는 점은 어떤 부분에서 사람을
         귀찮게 하는 부분이 있습니다.

        /*
        이상의 코드에서 문제점은 22번 라인이 실행됐을 때 데이터를 입력받지 않고
        그대로 넘가서 23번 라인과 24번 라인이 실행된다는 점입니다.
        이상의 문제는 nextInt()에서 값을 입력하고 enter를 치게 되는데,
        그 경우 다음 nextLine()에서 enter키를 받아들여서 빈 값의 상태로 enter를
        쳤다고 알아듣기 떄문에 곧장 23번 라인이 실행됐습니다.

        해결방법 : enter키를 받아주는 nextLine()을 하나더 적어줍니다.



        import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);
        System.out.println("올해는 몇 년도 인가요? >>>");
        int year = scanner.nextInt();
        // enter키를 받아주는 nextLine()을 추가
        scanner.nextLine();
        System.out.println("당신의 이름은 무엇인가요? >>>");
        String name = scanner.nextLine();
        System.out.println("연도 : " + year);
        System.out.println("이름 : " + name);
        2.다음과 같이 콘솔에 출력될 수 있또록 코드를 작성하시오.
        점수를 입력하세요 >>> 4.5
        이름을 입력하세요 >>> 김일
        김일 학생의 점수는 4.5입니다
         */
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        System.out.println("점수를 입력하세요>>>");
        scanner.nextLine();
        System.out.println("이름을 입력하세요>>>");
        String name = scanner.nextLine();
        System.out.println(name + "학생의 점수는" + score + "입니다");


    }
}
