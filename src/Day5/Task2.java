package Day5;

import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        String message = "Hello,how are you ?";
        boolean isMessageAQuestion = message.endsWith("?");
        System.out.println("is Message a Question ? "+ isMessageAQuestion);
        //
        String hi = "Hello TechnoStudy!";
        String lowerCasedHi = hi.toLowerCase();
        System.out.println(hi.toLowerCase());

        //

        String upperCasedHi = hi.toUpperCase();
        System.out.println(upperCasedHi);
    }

}
