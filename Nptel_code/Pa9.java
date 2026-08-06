import java.util.Scanner;

public class Pa9 {

    static class Rectangle {
        int length;
        int width;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int w = sc.nextInt();

        Rectangle rect = new Rectangle();

        rect.length = l;
        rect.width = w;

        System.out.print("Area of Rectangle is: " + (rect.length * rect.width));

        sc.close();
    }
}