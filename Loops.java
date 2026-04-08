import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // For loop /////

        Scanner in = new Scanner(System.in);

        // Print numbers fromm 0 to 10
        int n = 1;
        // for (i = 1; i <= 10; i += 2) {
        // System.out.println("Hello");
        // }
        // print numbers from 1 to n

        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // for (int num = 0; num <= n; num++) {
        // System.out.println(num + " ");
        // }

        //// While loop ///

        // int num = 1;
        // while (num <= 10){
        // System.out.println(num);
        // num += -2;
        // }

        ////// Do while loop //////
        do {
            System.out.println("Heloo");
            n++;
        } while (n <= 5);
    }
}
