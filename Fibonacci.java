public class Fibonacci {
    //0 1 1 2 3 5 8 13 21..

    public static void main(String args[]) {
        int i = 0;
        int j = 1, k = 0;

        System.out.print(i);

        for (int c = 1; c <= 10; c++) {
            i = j;
            j = k;
            k = i + j;
            System.out.print(" " + k);
        }
    }

}
