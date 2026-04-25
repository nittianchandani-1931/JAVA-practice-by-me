
import java.util.Scanner;
import java.util.Arrays;

public class Multidimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * 
         */

        // int arr[][] = new int[3][]; // number of rows is mandatory

        // int[][] arr = {
        // { 1, 2, 3 }, // 0th index
        // { 4, 5 }, // 1st index
        // { 6, 7, 8, 9 }, // 2nd index -> arr[2]={6,7,8,9}

        // };
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows

        // Input
        for (int row = 0; row < arr.length; row++) {
            // arr[row] = in.nextInt();

            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }
        }

        // output
        System.out.println("The Matrix is: ");
        for (int row = 0; row < arr.length; row++) {

        // for each column in every row
        for (int col = 0; col < arr[row].length; col++) {
        System.out.print(arr[row][col] + " ");
        }
        System.out.println();
        }
        // Enhanced for loop
        // for (int row = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }
        
    }
}
