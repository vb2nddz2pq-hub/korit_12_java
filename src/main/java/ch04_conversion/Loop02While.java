package ch04_conversion;

public class Loop02While {
    public static void main(String[] args) {
        /*
        1부터 100까지 출력하시오.
        실행 예
        1
        2
        3
        ...
        int i = 0;
        while(i < 100){
            System.out.println(++i);
            문제2
            123456...10
            11 12 13 ...20
            ...
            91 92 ..100
            으로 출력하시오
            힌트 : 1 2 3 4 5 6 ..10 을 출력하는게 한 번의 반복
                힌트2 : 첫 번째 반복의 경우 첫 번쨰 변수가 1로시작하는데,
                두 번쨰 반복의 첫 번쨰 변수는11이네요.
                세 번쨰는 21이구요
                10씩 차이가 나네요 /
                그럼10씩 더하면 되는거 아닌가 하는 생각이 드셧다면 풀 수 있습니다 근데 코드가 길고 안예쁘지 않을까? -> 안예쁘다
            //
        int i = 0;
        while (i < 100){
            System.out.println(++i + " ");
            if(i % 10 == 0){
                System.out.println();
            }
        }
        int j = 1;
        while(j < 101 ){
            System.out.println(j + "" + (j+1) +""+ (j+2) +"" + (j+3) +"" + (j+4) +"" + (j+5) +"" + (j+6) +"" + (j+7) +"" + (j+8) +"" + (j+9) );
        }
         */
    }
}
