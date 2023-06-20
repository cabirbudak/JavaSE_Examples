public class DoubleExample01 {

    public static void main(String[] args) {
        double n1 = 1, n2 = 1.5, n3 = 2;

        System.out.println("..:: Sayılar ::..");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println("");
        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " sayısı büyüktür.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " sayısı büyüktür.");

        else
            System.out.println(n3 + " sayısı büyüktür.");
    }
}
