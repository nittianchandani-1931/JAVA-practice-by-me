import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        // fun(31);
        // fun("Chandani");
        int ans = sum(21, 43);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }



    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
