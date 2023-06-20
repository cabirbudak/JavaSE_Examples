public class AssignmentOperator {
    public static void main(String[] args) {
        byte byteNumber = 126;
        short shortNumber = 327;
        int intNumber = 1058;
        long longNumber = 12042;
        float floatNumber = 42.8f;
        double doubleNumber = 8.58;
        char character = 'A';
        boolean booleanInformation = true;
        String courseName = "Java";

        long sum = intNumber + longNumber;
        System.out.println("sum : " + sum);
        System.out.println("intNumber line13 : " + intNumber++);
        System.out.println("intNumber line14 : " + intNumber);
        System.out.println("intNumber : " + (intNumber /= intNumber));
    }
}
