import java.util.Scanner;

public class Pa4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        for (int i = 1; i <= 4; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }

        in.close();
    }
}