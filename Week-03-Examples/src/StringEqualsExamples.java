public class StringEqualsExamples {
    public static void main(String[] args) {
        String username1 = new String ("name1");
        String username2 = new String ("name1");

        boolean isEquals = username1 == username2;
        boolean isEquals2 = username1.equals(username2);

        System.out.println(isEquals);
        System.out.println(isEquals2);
    }
}
