package One;

import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisor can not be zero");
        }
        return num1/num2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter two ints");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        //System.out.println(quotient(num1, num2));

        try {
            int result =    quotient(num1, num2);
            System.out.println(num1 + " divided by " + num2 + " equals " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: an int cannot be divided by zero");
        }

        System.out.println("Execution continues");
    }
}
