package chapter1_a_brief_introduction_to_java;

public class NumericFunctions {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
            //System.out.print(result + "-");
        }
        //System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            System.out.print(x);
            System.out.print(" ");
            System.out.println(factorial(x));
        }
    }
}
