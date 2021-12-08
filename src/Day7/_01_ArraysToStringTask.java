package Day7;

import java.util.Arrays;

public class _01_ArraysToStringTask {
    public static void main(String[] args) {
        int[] arrayOfInts = {25,78,6,39};
        System.out.println(Arrays.toString(arrayOfInts));

        arrayOfInts[0] = 39;
        arrayOfInts[3] = 25;
        System.out.println(Arrays.toString(arrayOfInts));



    }
}
