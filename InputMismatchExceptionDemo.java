package Two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continueInput = true;

        do{
            try{
                System.out.println("Enter an int: ");
                int num = scan.nextInt();

                //display result
                System.out.println("The number entered was " + num);
                continueInput = false;
            }
            catch (InputMismatchException e) {
                System.out.println("Try again. (" + "Incorrect input: an int is required)");
                scan.nextLine(); // Discard Input
            }
        } while(continueInput);
    }
}
