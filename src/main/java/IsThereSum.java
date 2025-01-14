import java.util.Arrays;

public class IsThereSum {
    /**
     * Check if there exist two numbers in an array add up to some other number.
     * You will likely need a for loop nested inside of another for loop for this problem - each for loop checking
     * sums of two different indexes of arr.
     *
     * @param arr an array of ints.
     * @param target a hypothetical sum of two numbers.
     * @return true if two separate values in the array add up to a target, false otherwise.
     */
    public boolean searchArray(int[] nums, int val) {
        for (int num: nums) {
            if (num == val) {
                return true;
            }
        }
        return false;
    }
    public boolean check(int[] arr, int target){
        // return false;
        int difference;
        for (int i = 0; i < arr.length - 1; i++) {
            int num = arr[i];
            difference = target > num ? target - num : num - target;
            int[] slice = Arrays.copyOfRange(arr, (i + 1), (arr.length - 1));
            if (searchArray(slice, difference) == true) {
                return true;
            }
        }
        return false;
    }
}
