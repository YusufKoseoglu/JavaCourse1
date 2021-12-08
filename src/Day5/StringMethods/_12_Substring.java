package Day5.StringMethods;

public class _12_Substring {
    public static void main(String[] args) {
        String message = "IntelliJ is cool";
        String substring = message.substring(12);
        System.out.println(substring);

        String substring2 = message.substring(0,8);
        System.out.println(substring2);
    }
}
