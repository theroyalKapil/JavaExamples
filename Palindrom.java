public class Palindrom {

    public static void main(String args[]) {
        String palindrom = "Abcba";

        String reverse = "";
        int length = palindrom.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + palindrom.charAt(i);
        }

        if (palindrom.equalsIgnoreCase(reverse)) {
            System.out.println("String is palindrom!!");
        } else {
            System.out.println("String is not palindrom!!");
        }

        int number = 4546;
        int sum = 0, r = 0, temp = 0;

        temp = number;

        while (number > 0) {
            r = number % 10;
            sum = (sum * 10) + r;
            number = number / 10;
        }

        if (temp == sum) {
            System.out.println("Number is palindrom.");
        } else {
            System.out.println("Number is not palindrom.");
        }

    }
}
