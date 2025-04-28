//Reshape the mateix

import java.util.Arrays;

public class leetcode566 {
    public static void main(String[] args) {
        int[][] original = {
            {1,2},
            {3,4},
        };
        int r = 1;
        int c =4;
        int index=0;
        int arr[][]=new int[r][c];

       
        for (int[] row : original) {
            for (int num : row) {
                arr[0][index++] = num;
            }
        }

        for (int[] rows : arr) {
            System.out.println(Arrays.toString(rows));
        }
    }
}
