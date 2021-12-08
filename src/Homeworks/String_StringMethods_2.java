package Homeworks;

import java.util.Locale;

public class String_StringMethods_2 {
    public static void main(String[] args) {
        String a = "TechnoStudy SDET Course!";
        System.out.println(a.startsWith("T"));

        String b = "I love Java!";
        System.out.println(b.endsWith("java!"));

        String c = "    There are 8 primitive data types in Java!";
        System.out.println(c.trim());

       // String d = "My bank account number is 0987654323456789 and my rooting number is 48883280129.";
       // String replacedD = d.replaceAll("[20-41]","*");
       // System.out.println(replacedD);

        String e = "Pracicing Java is really important!";
        System.out.println(e.replaceAll("a","@"));

        String f1 = "HEY!";
        String f2 = "hey!";
        System.out.println(f1.equals(f2));

        String g = "hey!";
        System.out.println(g.toUpperCase(Locale.ROOT));

        String h = "We are going to be Software Testers in 6 months!";
        System.out.println(h.substring(19,35));

        String k1 = "123456789";
        String k2 = "0987654321";
        System.out.println(k1.concat(k2));



    }
}
