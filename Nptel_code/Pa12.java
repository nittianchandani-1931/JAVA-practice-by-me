import java.util.Scanner;

class cls1 {
    void add(int s, int r) {
        System.out.println(s + r);
    }
}

class cls2 extends cls1 {

    void mul(int s, int r) {
        System.out.println(s * r);
    }

    void task(int s, int r) {
        add(s * s, r * r);
    }
}

public class Pa12 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        cls2 obj = new cls2();

        int a = sc.nextInt();
        int b = sc.nextInt();

        obj.add(a, b);
        obj.mul(a, b);
        obj.task(a, b);
    }
}