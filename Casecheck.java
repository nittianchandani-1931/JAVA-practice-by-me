import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        // System.out.println(in.next().trim());
        // String word = "Welcome";
        // System.out.println(word.charAt(0));
        // System.out.println(ch);

        // int a= 20;
        // int b = 30;
        // if (a == 20 || b ==23){
        // System.out.println("Hii Vikas");
        // }

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {

            System.out.println("Uppercase");
        }
        System.out.println(ch);
    }
}
