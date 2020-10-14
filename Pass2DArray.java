package Two;

import java.util.Arrays;
import java.util.Scanner;

public class Pass2DArray {
    private int[][] m;

    public Pass2DArray(int[][] m) {
        this.m = m;
    }

    public Pass2DArray(int rows, int columns) {
        this.m = new int[rows][columns];
    }


    public int sumElements () {
        //4.) Summing alll elements, use total to store sum, initialize as zero, add each element using loop
        int total = 0;
        for (int row = 0; row < m.length ; row++) {
            for (int column = 0; column < m[row].length ; column++) {
                total += m[row][column];
            }
        }
        return total;
    }

    public void printM () {
        //3.) Printing arrays: To print a 2D array yopu have to print each element using a loop
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                System.out.print(m[row][column] + " ");
            }
            System.out.println();
        }
    }

    public void setM() {
        // 1.) Initializing arrays with input values
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + m.length + " rows and " +
                m[0].length + " columns");
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length ; column++) {
                this.m[row][column] = scan.nextInt();
            }
        }
        printM();
    }
}
