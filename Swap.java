public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // swapping of two numbers
        // int temp = a;
        // a = b;
        // b = temp;
        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Chandani kumari";
        changeName(name);
        System.out.println(name);

    }

    static void changeName(String naam) {
        naam = " Chaurasiya";
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
