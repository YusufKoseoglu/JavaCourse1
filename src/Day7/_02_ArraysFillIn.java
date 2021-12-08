package Day7;

import java.util.Arrays;

public class _02_ArraysFillIn {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[2] = 99 ;
        System.out.println(Arrays.toString(numbers));
        Arrays.fill(numbers,1);
        System.out.println(Arrays.toString(numbers));
    }
}
