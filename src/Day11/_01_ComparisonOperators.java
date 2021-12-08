package Day11;

public class _01_ComparisonOperators {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        // Equality operator

        System.out.println(a==b);
        System.out.println(a==c);

        //Inequality Operator
        System.out.println(a!=b);

        //Greater than
        System.out.println(c>a);

        //Smaller than
        System.out.println(a<c);

        // Greater than or equal
        System.out.println(c >= a);


        // this expression is producing boolean value so we can store it inside a boolean variable
        boolean aIsLessThanC = a < c;
        System.out.println(aIsLessThanC);



    }}
