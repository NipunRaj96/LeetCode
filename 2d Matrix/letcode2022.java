//convert 1d array into 2d array

import java.util.Arrays;

public class letcode2022 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int m = 2; // Rows
        int n = 2; // Columns
        int[][] ans = new int[m][n];

        int index = 0; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = nums[index++];
            }
        }

        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }
}
