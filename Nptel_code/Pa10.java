import java.util.Scanner;

public class Pa10 {

    // Declare a separate class named Circle
    static class Circle {
        int radius;

        // Constructor
        Circle(int radius) {
            this.radius = radius;
        }

        // Method to calculate area
        double area() {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read radius value from user
        int r = sc.nextInt();

        // Create Circle object
        Circle c = new Circle(r);

        // Display area
        System.out.println("Area of Circle = " + c.area());

        sc.close();
    }
}