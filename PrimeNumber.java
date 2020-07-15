public class PrimeNumber {
    // 44 -> Not prime
    // 2,3,5,7,11 -> prime
    // number divide with 1 or self

    public static void main(String args[]) {
        int number = 2;
        int count = 0, flag = 0;

        count = number / 2;

        if (number == 0 || number == 1) {
            System.out.println("Number is not prime number");
        } else {
            for (int i = 2; i <= count; i++) {
                if ((number % i) == 0) {
                    System.out.println("Its Not Prime number!");
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0) {
            System.out.println("Its Prime number");
        }
    }


}
