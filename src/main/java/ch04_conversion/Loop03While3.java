package ch04_conversion;

public class Loop03While3 {
    public static void main(String[] args) {
        int day = 1;
        while (day < 6){
            int lesson = 1;  //반복실행문1
            while (lesson < 4){
                System.out.println(day + "일차" + lesson + "교시입니다."); //반복실행문2
                lesson++;
            }
            day++; // 반복실행문1-b
        }
        }
    }

