import java.util.Scanner;

public class Pa7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read length and width of the rectangle
        int length = sc.nextInt();
        int width = sc.nextInt();

        int perimeter = 2 * (length + width);

        System.out.println("Perimeter is: " + perimeter);

        sc.close();
    }
}