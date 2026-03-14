public class LogicalOperator {
    public static void main(String[] args) {
        int x = 4;
        int y = 3;
        int a = 6;
        int b = 9;
        // boolean result = x>y && a>b;
        // boolean result1 = x>y || a>b;
        boolean result1 = x>y || a>b ||a<b;

        // System.out.println(result1);
                System.out.println(!result1);

    }
}
