package One;

import java.util.Scanner;

public class BasicOperations {
    private int[][] matrix;

    public BasicOperations(int length) {
        this.matrix = new int[length][length];
    }

    public void manuallyCreate() {
        // 1.) Initializing arrays with input values
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length ; column++) {
                this.matrix[row][column] = scan.nextInt();
            }
        }

    }

    public void randomlyCreate() {
        //2.) Initialize arrays with random variables
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                this.matrix[row][column] = (int) (Math.random() * 100);
            }
        }

    }

    public void printMatrix () {
        //3.) Printing arrays: To print a 2D array yopu have to print each element using a loop
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public int sumElements () {
        //4.) Summing alll elements, use total to store sum, initialize as zero, add each element using loop
        int total = 0;
        for (int row = 0; row < matrix.length ; row++) {
            for (int column = 0; column < matrix[row].length ; column++) {
                total += matrix[row][column];
            }
        }
        return total;
    }

    /*
    Which row has the largest sum? Use vars maxRow and indexOfMaxRow to track the largest sum and index of the row.
    For each row, compute its sum and update the max row and indexOfMaxRow if the new sum is greater;
     */

    public String largestRow () {
        int maxRow = 0;
        int indexOfMaxRow = 0;

        for (int column = 0; column < matrix[0].length ; column++) {
            maxRow += matrix[0][column];
        }

        for (int row = 0; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                totalOfThisRow += matrix[row][column];
            }

            if(totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }

        return "Row " + indexOfMaxRow + " has max sum of " + maxRow;
    }

    /*
    7.) Random shuffling. For each element matrix[i][j], randomly generate indices i1 and j1 and swap matrix[i][j]
    with matrix[i1][j1], as follows:
     */

    public void randomShuffle() {
        for (int i = 0; i < matrix. length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int)(Math.random() * matrix.length);
                int j1 = (int)(Math.random() * matrix[i].length);

                // Swap matrix[i][j] with matrix[i1][j1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
    }
}
