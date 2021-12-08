package Day20;

public class Mentoring_ForLoop_2 {
    public static void main(String[] args) {
        int array [] = {10,30,150,40,90,20,120,70};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+= array[i];

        }
        int average = sum / array.length;
        System.out.println(average);
    }
}

