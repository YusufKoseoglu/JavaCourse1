package Homeworks;

import java.time.Year;
import java.util.Locale;

public class String_StringMethods {
    public static void main(String[] args) {
        String a = "I love Java!";
        System.out.println(a.length());

        String b = "Sprint planning";
        System.out.println(b.length());

        String c = "paper";
        System.out.println(c.toUpperCase(Locale.ROOT));

        String d = "OraNge";
        System.out.println(d.toLowerCase(Locale.ROOT));

        String e = "New Jersey";
        System.out.println(e.toUpperCase(Locale.ROOT));

        String f = "New York";
        System.out.println(f.toLowerCase(Locale.ROOT));

        String g = "apple";
        System.out.println(g.contains("app"));

        String h = "Florida";
        System.out.println(h.indexOf("o"));

        String j = "Thank You";
        System.out.println(j.indexOf("Y"));

        String k = "Friend";
        System.out.println(k.charAt(3));
    }

}
