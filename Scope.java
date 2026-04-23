public class Scope {
    public static void main(String[] args) {
        int a = 190;
        int b = 20;
        String name = "chandani";

        {
            // int a = 31; // Already initialised outside the block in the same method ,
            // hence u cannot initialised again
            a = 19; // reassign the original ref value to the some other value
            System.out.println(a);
            int c = 31;
            name = "Vikas";
            System.out.println(name);
            // Values initiqalised in this block , will remain in this block
        }
        System.out.println(a);
        System.out.println(name);
        // System.out.println(c); // cannot use outside the block

        // Scoping in for loops
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }

    static void random(int marks) {
        int num = 45;
        System.out.println(num);
        System.out.println(marks);
    }
}
