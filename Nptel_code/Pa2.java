    import java.util.Scanner;

public class Pa2 {
    public static void main(String[] args) {

        double width;
        double height;

        Scanner in = new Scanner(System.in);

        width = in.nextDouble();
        height = in.nextDouble();

        double perimeter = 2 * (height + width);
        double area = width * height;

        System.out.println(area);
        System.out.println(perimeter);

        in.close();
    }
}

