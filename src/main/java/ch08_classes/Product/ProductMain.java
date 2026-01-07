package ch08_classes.Product;

public class ProductMain {
    public static void main(String[] args) {
        ch08_classes.products.Product product1 = new ch08_classes.products.Product();
        //필드에 값 대입하는 거죠.
        product1.productNum = 123456;
        product1.productName = "LG엘패드";

        ch08_classes.products.Product product2 = new ch08_classes.products.Product(987654);
        product2.productName = "다이소충전기";

        product1.showInfo();
        product2.showInfo();

        ch08_classes.products.Product product3 = new ch08_classes.products.Product("USB-C 케이블");
        product3.productNum = 159357;


        ch08_classes.products.Product product4 = new ch08_classes.products.Product(951753, "GFlip6");
        product3.showInfo();
        product4.showInfo();
    }
}