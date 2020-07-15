public class Calculater {

    public static void main(String args[]) {
        int no1 = 5;
        int no2 = 10;

        System.out.println("Addition is : " + add(no1, no2));
        System.out.println("Multiplication is : " + mul(no1, no2));
        System.out.println("Division is : " + div(no1, no2));
        System.out.println("Substraction is : " + sub(no1, no2));
    }

    private static int add(int no1, int no2) {
        return no1 + no2;
    }

    private static int mul(int no1, int no2) {
        return no1 * no2;
    }

    private static int div(int no1, int no2) {
        return no1 / no2;
    }

    private static int sub(int no1, int no2) {
        return no1 - no2;
    }

}
