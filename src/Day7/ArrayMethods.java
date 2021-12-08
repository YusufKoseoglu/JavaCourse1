package Day7;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] firstArray = {1,3,5};
        int[] secondArray = {3,1,5};
        int[] thirdArray = {1,3,5};
        System.out.println(Arrays.equals(firstArray,secondArray));
        System.out.println(Arrays.equals(firstArray,thirdArray));
        System.out.println(Arrays.equals(secondArray,thirdArray));
        //
        String[] strArray1 = {"1","2"};
        String[] strArray2 = {"1","2"};
        System.out.println(Arrays.equals(strArray1,strArray2));
        System.out.println("\\");

    }
}
