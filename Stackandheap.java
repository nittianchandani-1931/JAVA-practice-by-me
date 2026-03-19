class Calculator {
    int num = 5;

    public int add(int n1, int n2) {
        // System.out.println(num);
        return n1 + n2;
    }
}

public class Stackandheap {
    public static void main(String a[]) {
        int data = 10;
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();

        int r1 = obj.add(4,5);
        // System.out.println(r1);

        obj.num=19;
        System.out.println(obj.num);
        System.out.println(obj1.num);

    }
}
