public class Factorial {
    public static void main(String[] args) {
        // Factorial of a number
        // number = 6!= 6*5*4*3*2*2*1
        int num = 6;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
