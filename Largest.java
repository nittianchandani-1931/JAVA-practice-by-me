
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: Find the largest of three numbers
        int  max = a;
        if(b >  max){
            b = max;
        } 
            if( c > max){
                c =  max;
            }
        
System.out.println(max  );
    }
}

