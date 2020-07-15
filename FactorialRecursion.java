public class FactorialRecursion {

    public static void main(String args[]) {

        int num = 4;
        int factorial = 0;

        factorial = fact(num);

        System.out.println(" Factorial is : " + factorial);
    }

    private static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
