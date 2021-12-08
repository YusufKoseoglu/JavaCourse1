package Day6;

public class Task3 {
    public static void main(String[] args) {
        String name = "Hello Techno Study";
        System.out.println(name.isEmpty());
        //
        String aga = "Hello Techno Study";
        System.out.println(aga.contains(""));

        //
        String hello = "Hello Techno Study!";
                boolean isStringEmpty = hello.isEmpty();
        boolean isStringContainsSpace = hello.contains("");

        System.out.println(isStringContainsSpace);
        System.out.println(isStringEmpty);
    }
}
