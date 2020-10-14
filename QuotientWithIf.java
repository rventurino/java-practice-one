package One;

import java.util.Scanner;

public class QuotientWithIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //prompt user for 2 ints

        System.out.println("enter two ints: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num2 != 0) {
            System.out.println(num1 + " divided by " + num2 + " equals " + (num1 / num2));
        } else System.out.println("Divisor can not be zero");
    }
}
