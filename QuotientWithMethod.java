package One;

import java.util.Scanner;

public class QuotientWithMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //prompt user for 2 ints

        System.out.println("enter two ints: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int result = quotient(num1, num2);
        System.out.println("Result: " + result);
    }

    public static int quotient (int num1, int num2) {
        if(num2 == 0 ) {
            System.out.println("Divisor can't be zero");
            System.exit(1);
        }

        return num1/ num2;
    }
}
