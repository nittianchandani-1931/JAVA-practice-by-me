
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        // list.add(19);
        // list.add(19);
        // list.add(199);
        // list.add(419);
        // list.add(319);
        // list.add(139);

        // System.out.println(list.contains(199)); // true
        // // System.out.println(list);

        // list.set(0, 99); // replace element at index 0
        // list.remove(2); // remove element at index 2

        // System.out.println(list);
        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));   // PAss index here , list[index] syntax will not work here
        }
        // System.out.println(list);
    }
}
