package ch08_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA classA1 = new ClassA();

        classA1.num = 100;
        classA1.name = "김일";

        ClassA classA2 = new ClassA();
        classA2.num = 200;
        classA2.name = "김이";
        System.out.println(classA2.name + "의 번호는 " + classA2.num + "입니다.");

        // 메서드 호출 방법 -> 이미 설명했습니다.
        // 객체명.메서드명()

        classA1.callName();
        classA2.callName();
        // 이상의 두 method 호출 결과는
        // 서로 '다르다'고 말해야 합니다.

        /*
            Scanner의 인스턴스를 생성하고
            ClassA의 인스턴스인 classA3를 생성한 다음,
            다음과 같이 실행될 수 있도록 작성하시오.



         */
        Scanner scanner = new Scanner(System.in);
        ClassA classA3 = new ClassA();
        System.out.print("이름을 입력하세요 >>> ");
        classA3.name = scanner.nextLine();
        System.out.print("번호를 입력하세요 >>> ");
        classA3.num = scanner.nextInt();
        System.out.print("점수를 입력하세요 >>> ");
        classA3.score = scanner.nextDouble();

        classA3.callName();
    }
}
