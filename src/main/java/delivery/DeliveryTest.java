package delivery;

public class DeliveryTest {
    public static void main(String[] args) {
        Delivery order1 = new Delivery(20240731,"abc123","2024년7월31일",
                "이선엽", "PD0345-12", "부산 북구 만덕3동");
        order1.printInfo();

    }


}
