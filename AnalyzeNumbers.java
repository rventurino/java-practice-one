package One;

import java.util.Random;
    import java.util.Arrays;
import java.util.Scanner;


public class AnalyzeNumbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("This program generates a specified amount of random numbers,");
            System.out.println("then calculates the average of them and tells the amount of numbers " +
                    "\n above the average");
            System.out.println("Enter the number of items");

            int n = input.nextInt();
            double[] numbers = new double[n];
            double sum = 0;
            Random rand = new Random();

            for (int i = 0; i < n ; i++) {
                numbers[i] = (50 + rand.nextDouble() * 100 );
                sum += numbers[i];
            }
            for (int i = 0; i < n ; i++) {
                System.out.println(numbers[i]);
            }
        /*
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
    */

            double average = sum / n;

            int count = 0;
            for (int i = 0; i < n ; i++) {
                if(numbers[i] > average) count ++;
            }
            System.out.println("Average is " + average);
            System.out.println("Number of elements above the average is " + count);
        }
    }

