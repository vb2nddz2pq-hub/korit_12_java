import java.util.Scanner;

//public class Condition08Task3 {
//    public static void main(String[] args) {
        /*
        과제 : 윤년 계산기 작성
        윤년 (leap year)은 특정 조건을 만족하는 년을 의미합니다.

        윤년을 판단하는 규칙은
        1. 연도가 4로 나뉘어 떨어지는 해는 윤년에 해당하수 '있음'
        2. 그러나 100으로 나누어 떨어지는 해는 윤년이 아님.
        3. 그런데 100을로 나누어 떨어지는 해 중에 400으로도 나누어 떨어지면 윤년임.

        예를들어,
        2020년은 4로 나누어 떨어지기 떄문에 윤년 (100으로는 안나누어지니까요)
        1900년은 100으로 나누어 떨어지기 떄문에 윤년이 아님(400으로 안나누어집니다)
        2000년은 100으로 나누어떨어지기는 하는데 400으로도 나누어 떨어져서 윤년.

        이상의 조건을 만족하는 윤년 계산기를 조건문을 활용해 작성하시고.
        scanner를 imprt하여 ,
        year 변수에 값을 대입햇을 때 윤년인지 아닌지 판별할 수 있도록 하시오

         *입/력하세요 >>> ");
        year = scanner.nextInt();

        if(year % 4 == 0) {
            if(year % 100 == 0) {
                System.out.println("윤년이 아닙니다.");
            } else if(year % 400 == 0) {
                System.out.println("윤년입니다.");
            }
    }


        if (year % 400 == 0) {
            System.out.println("윤년입니다.");
        } else if (year % 100 == 0) {
            System.out.println("윤년이 아닙니다.");
        } else if (year % 4 == 0) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }




        String leapYear = "윤년이 아닙니다";

        if (year % 400 == 0) {
            leapYear = "윤년입니다.";
        } else if (year % 100 == 0) {
        } else if (year % 4 == 0) {
            leapYear = "윤년입니다.";
        } else {
        }

        System.out.println(year + "년은 " + leapYear);
        //개발자가 조건을 어떻게 배치하는가에 따라 결과값이 다르게 나올 수 있는데,
        // 여기서는 가장 널널한 조건부터 촘촘한 조건으로 배치했습니다.
    }
}
*/