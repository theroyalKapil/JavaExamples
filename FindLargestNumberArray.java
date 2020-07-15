import java.util.Arrays;

public class FindLargestNumberArray {

    public static void main(String args[]) {
        int[] list = new int[]{5, 6, 9, 3, 2, 8};

        int highestNumber = list[0];

        for (int i = 0; i < list.length; i++) {
            if(list[i] > highestNumber)
                highestNumber = list[i];
        }
        System.out.println("Highest Number in Array is : " + highestNumber);


        Arrays.sort(list);
        System.out.println("Highest Number in Array is : " + list[list.length -1]);

    }
}
