package chapter2;

public class ImplicitConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int iNUM = bNum;

        System.out.println(bNum);
        System.out.println(iNUM);

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println(iNUM);
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNUM;
        System.out.println(dNum);


    }
}
