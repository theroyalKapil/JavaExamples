

public class ArrayCopy {
    public static void main(String[] args) {
        int[] first = new int[]{5,4,3,2,1};
        int[] second = new int[first.length];

        //Copy array
        for (int i = 0; i < 5; i++) {
            second[i] = first[i];
        }

        //print array
        for (int j = 0; j < 5; j++) {
            System.out.print(" " + second[j]);
        }

    }
}
