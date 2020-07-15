public class BubbleSort {

    static void bubbleSort(int list[]) {
        int temp = 0;
        for (int i = 0; i < list.length; i++) {
            System.out.println();
            System.out.println("i : " + i);
            for (int j = 1; j < list.length - i; j++) {
                System.out.println("j : " + j);
                System.out.println(" list[j - 1] > list[j] :"+ list[j - 1] +" > " +  list[j]);
                if (list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int list[] = new int[]{5, 3, 6, 2, 8};

        //Before sort
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        // call sort
        bubbleSort(list);
        System.out.println();

        //After sort
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
