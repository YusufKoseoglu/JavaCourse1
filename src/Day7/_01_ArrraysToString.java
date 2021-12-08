package Day7;

import java.util.Arrays;

public class _01_ArrraysToString {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[100];
        arrayOfInts[0] = 5;
        arrayOfInts[99] = 10;
        System.out.println(Arrays.toString(arrayOfInts));
        // lastIndex = length.OfArray - 1
        int lastIndex = arrayOfInts.length -1;
        arrayOfInts[lastIndex] = 20;
        System.out.println(Arrays.toString(arrayOfInts));

    }
}
