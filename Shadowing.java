public class Shadowing {

    static int x = 31; // this will be shadowed at line 13

    public static void main(String[] args) {
        System.out.println(x); // 31
        int x; // the class variable at line 3 is shadowed by this
        // System.out.println(x); // Scope will begin when value is initialized
        x = 23;
        System.out.println(x);

        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
