package  project3;

    /*
   Create a method whose name is camelCase
   It takes a String parameter
   It returns a String

                                          Method capitalizes all the first letters of the word(s) in the argument

   Sample-1:
   my family lives in the United States. -> My Family Lives In The United States.

   Sample-2:
   sleeplessness -> Sleeplessness
     */

public class
CamelCase {
//    public static void main(String[] args) {
//        System.out.println(camelCase("my family lives in the United States"));
//    }
    public static String camelCase(String str) {
        String[] array = str.split(" "); //[0] "my", [1] "family", [2] "lives", [3] "in", [4] "the", [5] "United", [6] "States"
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].substring(0,1).toUpperCase() + array[i].substring(1);
        }
        String a = "";
        for (int i = 0; i < array.length; i++) {
            a = a.concat(array[i] + " ");
        }
        return a.trim();
    }
}