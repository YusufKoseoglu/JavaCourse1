package Homeworks;

import java.util.Arrays;

public class Array_CreateArray {
    public static void main(String[] args) {
        String[ ] array1 = {"apple,orange,banana kiwi"};
        System.out.println("Market:  " + array1);

        String[ ] array2 = {"new jersey", "new york ", "boston","california"};
        System.out.println(array2.length);
        System.out.println(array2);

        int [] array3 = {13,15,14,16,16,19,22,22,20,43,8};
        System.out.println(Arrays.stream(array2).sorted());

        char [] array4 = {'a','4', 'r', 'W', '+', 'M', '1', '!'};
        System.out.println(array4[0]);
        System.out.println(array4[7]);

        int [] array5= {1, 5, 9 };
        int [] array6= { 5, 1, 9 };
        System.out.println(Arrays.stream(array5).sorted());
        System.out.println(array5.equals(array6));

        int [] array7 = { 49, 35, 56, 7, 63, 14 };
        System.out.println(Arrays.stream(array7).max());

























    }
}
