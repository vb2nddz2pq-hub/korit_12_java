package car;

public class Car {
    // 필드 선언
    String color;
    int speed;
    // 생성자를 배우면 해결되는 개념
//    String eval2 = (speed > 100 ? "빠릅니다." : "그냥저냥입니다.");

    // 메서드 정의
    public void drive() {
        System.out.println(color + " 자동차가 주행 중입니다.\n최고 속도는 " + speed + "입니다.");
    }

    public String brake() {
        return color + " 자동차가 멈췄습니다.";
    }
    public void displayCarInfo() {
        System.out.println("이 차의 색깔은 " + color + "색이고,");
        System.out.println("최고 속도는 " + speed + "km/h입니다. ");
    }
}
