package ch00_package;

public class Method08StarWiting3 {
    public static void main(String[] args) {


        for( int i = 0 ; i < 6 ; i++ ) {

            for( int j = 5 ; j > i ; j-- ) {
                System.out.print("  ");
            }

            for (int k = 0 ; k < i ; k++ ) {
                System.out.print("🐱‍👤");
            }

            System.out.println();
        }
        for ( int i = 0 ; i < 6 ; i ++ ) {

            for ( int j = 0 ; j < 6 - i ; j++ ) {
                System.out.print(" ");
            }

            for ( int k = 0 ; k < i ; k++ ) {
                System.out.print("✔");
            }
            System.out.println();
        }
    }
}
