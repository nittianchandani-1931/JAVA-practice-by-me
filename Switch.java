import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango":
                System.out.println("Mango is the king of Fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Earthed shape fruit");
                break;
            case "Grapes":
                System.out.println("My favourite fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");

        }

    }
}
