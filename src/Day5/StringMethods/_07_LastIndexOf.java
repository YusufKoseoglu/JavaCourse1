package Day5.StringMethods;

public class _07_LastIndexOf {
    public static void main(String[] args) {
        String message = "Hello Techno Study";
        int indexOfFirstSpace = message.indexOf('o');
        System.out.println(indexOfFirstSpace);

        int indexOfLastSpace = message.lastIndexOf('o');
        System.out.println(indexOfLastSpace);
    }
}
