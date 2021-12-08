package Day12;

public class _02_ifelseif {
    public static void main(String[] args) {
        // If temp >= 30 print hot
        // If temp >= 18 && < 30 print it is a good weather
        // If temp < 18 print cold



            int temp = 5;

            if (temp >= 30){
                System.out.println("It is a hot day!");
            }else if (temp >= 18 && temp < 30){
                System.out.println("It is a good weather!");
            }else {
                System.out.println("It is a cold day!");
            }
    }
}
