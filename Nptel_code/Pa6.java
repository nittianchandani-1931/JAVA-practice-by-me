import java.util.Scanner;

public class Pa6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width: ");
        double width = sc.nextDouble();

        // Calculate area
        double area = length * width;

        // Output
        System.out.println("Area of Rectangle = " + area);

        sc.close();
    }
}