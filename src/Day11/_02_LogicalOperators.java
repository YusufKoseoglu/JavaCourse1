package Day11;

public class _02_LogicalOperators {
    public static void main(String[] args) {
        int temperature = 23;
        boolean isWarm = temperature<30 && temperature>20;  // && AND operator
        System.out.println(isWarm);



        boolean hasHighScore = true;
        boolean hasGoodCredit = false;

        boolean isEligible = hasHighScore || hasGoodCredit;   //  || OR operator
        System.out.println(isEligible);
    }
}
