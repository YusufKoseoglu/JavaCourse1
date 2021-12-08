package Day20;

public class Mentoring_ForLoop_3 {
    public static void main(String[] args) {
        int intArray[] = {1,2,3,4,4,4,5,6,7,6};
        //Write a program that prints out the duplicate numbers


        for (int i=0;i<intArray.length;i++){

            for (int j = i+1; j < intArray.length; j++) {
                if(intArray[i]==intArray[j])
                    System.out.println(intArray[j]);
            
        }

    }}}

