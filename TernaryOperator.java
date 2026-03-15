public class TernaryOperator {
    public static void main(String[] args) {

        int n = 50;
        // if (n % 2 == 0)
        // System.out.println("The given number is Even number.");
        // else
        // System.out.println("The number is odd number.");

        int result = 0;
        result = n % 2 == 0 ? 10 : 20;
        System.out.println(result);
    }
}
