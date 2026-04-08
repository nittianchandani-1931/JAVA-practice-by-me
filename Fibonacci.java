import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // nth fibonacci number
        int a = 0;
        int b = 1;
        // int count = 2;

        // while (count <= n) { // while is used for nth fibonacci number
        // int temp = b;
        // b = b + a;
        // a = temp;
        // count++;
        // }
        // System.out.println(b);

        // for fibonacci series //

        
        // Edge case
        if (n == 1) {
            System.out.print(a);
            return;
        }

        // Print first two terms
        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
        }
    }
}