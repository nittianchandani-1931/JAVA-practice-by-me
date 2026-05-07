
public class LinearSearch {
    public static void main(String[] args) {
        int[] nums ={12, 45, 34, 65 ,13 ,19,31, -111};
        int target =391;
        int ans = linearSearch(nums , target);
System.out.println(ans);
    }

    // Search in the array : return the index if found
    // otherwise return -1 if item not found
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;

        }
        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hemce the target not found
        return -1;

    }

}