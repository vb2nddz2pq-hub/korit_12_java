package delivery;

public class Delivery {
    int orderNo;
    String userId;
    String date;
    String userName;
    String productNo;
    String address;

    public Delivery(int orderNo, String userID, String date, String userName, String productNo, String address ){
        this.orderNo = orderNo;
        this.userId = userID;
        this.date = date;
        this.userName = userName;
        this.productNo = productNo;
        this.address = address;
    }
    public void printInfo(){
        System.out.println("주문번호 : " + orderNo);
        System.out.println("주문자 아이디 : " + userId);
        System.out.println("주문날짜 : " + date);
        System.out.println("주문자 이름 : "+ userName);
        System.out.println("상품번호 : " + productNo);
        System.out.println("배송지 : " + address);
    }

}
