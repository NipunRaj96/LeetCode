// Count Negative Numbers in a Sorted Matrix
// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
// return the number of negative numbers in grid.

public class leetcode1351 {
    public static void main(String[] args) {
        int[][] arr={
            {4,3,2,-1},
            {3,2,1,-1},
            {1,1,-1,-2},
            {-1,-1,-2,-3},
        };

            int rows = arr.length;
            int cols = arr[0].length;
            int count=0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr[i][j]<0){
                    count++;
                }else{
                    continue;
                }
            }
        }
        System.out.println("No. of neg numbers in the grid: "+count);
    }
}
