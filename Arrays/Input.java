import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 14;
        arr[1] = 17;
        arr[2] = 31;
        arr[3] = 19;
        arr[4] = 54;
        // System.out.println(arr[1]);

        // Input using For loop
        // for (int i = 0; i < arr.length; i++) {
        // // arr[i] = in.nextInt();
        // System.out.print(arr[i] + " ");

        // arrya of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Vikas";
        System.out.println(Arrays.toString(str));
    }
}
// // Enhanced form of for loop
// for(int num : arr){ // for every elemennt in array, print the element
// System.out.println(num); // here num represents element of array
// }

// }
