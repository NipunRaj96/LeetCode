// 1827. Minimum Operations to Make the Array Increasing
// You are given an integer array nums (0-indexed). In one operation, you can choose an element of the array 
// and increment it by 1.
// For example, if nums = [1,2,3], you can choose to increment nums[1] to make nums = [1,3,3].
// Return the minimum number of operations needed to make nums strictly increasing.

public class leetcode1827 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 4, 1};
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                int diff = arr[i - 1] - arr[i] + 1;  // Find how much to increase
                arr[i] += diff;  // Make it greater
                count += diff;   // Add to total operations
            }
        }
        System.out.println("Total operations: " + count);
    }
}
