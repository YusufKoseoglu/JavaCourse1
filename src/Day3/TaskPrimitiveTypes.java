package Day3;

public class TaskPrimitiveTypes {
    public static void main(String[] args) {

        byte hoursInDay = 24;
        short minutesInDay = 1440;
        int secondsInDay = 86_400;
        long secondsInYear = 31_536_000L;
        long secondsIn100Years = 3_153_600_000L;

        System.out.println(hoursInDay);
        System.out.println(minutesInDay);
        System.out.println(secondsInDay);
        System.out.println(secondsInYear);
        System.out.println(secondsIn100Years);



        float laptopPrice = 999.99F;
        System.out.println(laptopPrice);

        float negativeDecimalNumber = -79.55F;
        System.out.println(negativeDecimalNumber);

        System.out.println("Max value for float: " + Float.MAX_VALUE);
        System.out.println("Min value for float: " + Float.MIN_VALUE);

        double mileage = 756.234;
        System.out.println("Mileage left to arrive Chicago:" + mileage);

     char firstLetterOfMyName = 'H';
        System.out.println(firstLetterOfMyName);

        char somethingFromKeyboard = '#';
        System.out.println(somethingFromKeyboard);

        char numberChar = '7';
        System.out.println(numberChar);

        char backslash = '\\';
        System.out.println(backslash);

        boolean isRaining = false;
        System.out.println(isRaining);

        boolean isEligible = true;
        System.out.println(isEligible);
        //Primitive Data Types

        //1 bytes //byte  -> -128 to 127
        byte b = 127;

        //2 bytes //short -> -32,768 to 32,767
        short s = 32767;

        //4 bytes //int   -> -2,147,483,648 to 2,147,483,647
        int intLength = 2147483647;

        //8 bytes //long  -> -9,223,372,036,854,775,808L to 9,223,372,036,854,775,807L
        long a = 9223372036854775807L;

        //4 bytes //float -> 6 to 7 decimal
        float f = 14.12345608274892734897f;

        //8 bytes //double -> 15 decimal
        double d = 14.12345678912345682498234897;

        //1 bit   //boolean -> true or false // 0 - 1
        boolean answer = true;

        //2 bytes //char -> single letters or ASCII characters
        char firstLetter = 84;
        char secondLetter = 83;
        char regularChar = 'n';
        System.out.println(firstLetter + secondLetter);

    }

    }