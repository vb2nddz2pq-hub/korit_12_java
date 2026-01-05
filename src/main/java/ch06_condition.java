public class ch06_condition {
    public static void main(String[] args) {
        /*
        if = else 문 : i 문 다음에는 나오는 조건식이 true일 때는 if 내의 {} 실행문이 실행
        / false 일 때는 else에 딸린 {} 실행문이 실행
        형식:
        if (조건식){
        실행문1
        }else{ else의 경우 if가 false일 때만 실행되기 때문에
        실행문2 if에서처럼 조건식이따로 있지 않습니다.
        }
         */
        int num1 = 0;
        if(num1 > 0){
            System.out.println("num은 양수입니다");
        }else{
            System.out.println("num은 음수입니다");
        }
    }
}
