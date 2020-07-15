public class ArmstrongNumber {
    //0, 1, 153, 370, 371, 407 ..
    //153 = (1*1*1)+(5*5*5)+(3*3*3)
    //where:
    //        (1*1*1)=1
    //        (5*5*5)=125
    //        (3*3*3)=27
    //So:
    //       1+125+27=153

    public static void main(String args[]) {

        int number = 370;
        int r = 0;
        int sum = 0, temp;

        temp = number;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + (r * r * r);
            temp = temp /10;
        }

        if(sum == number){
            System.out.println("Number is armstrong number");
        }
        else
        {
            System.out.println("Number is not armstrong number");
        }

    }
}
