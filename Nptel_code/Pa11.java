import java.util.Scanner;

class Pa11 {

    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x;
        x = in.nextInt();

        System.out.println(factorial(x));
    }
}