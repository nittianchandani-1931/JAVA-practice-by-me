import java.util.Scanner;
import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int[] nums = { 19, 5, 6, 78, 9 };
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[0] = 31;
    }
}
