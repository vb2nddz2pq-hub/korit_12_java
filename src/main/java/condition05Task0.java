import java.util.Scanner;

public class condition05Task0 {
    public static void main(String[] args){
        /*
        사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.
        score 가 90점 이상이라면 greade또는 A
        score 가 80점 이상이라면 greade또는 B
        score 가 70점 이상이라면 greade또는 C
        score 가 60점 이상이라면 greade또는 D
        score 가 59점 이상이라면 greade또는 E
         */
        Scanner scanner = new Scanner(System.in);
        int score;
        String grade;
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        // 중첩 if문을 적용한 조건문 작성
        if (score > 100 || score < 0) {
            System.out.println("불가능한 점수 입력입니다.");
            grade = "X";
        } else {
            if (score > 89) {
                grade = "A";
            } else if (score > 79) {
                grade = "B";
            } else if (score > 69) {
                grade = "C";
            } else if (score > 59) {
                grade = "D";
            } else {
                grade = "F";
            }
        }
//


    }
}
