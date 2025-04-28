//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

import java.util.Arrays;

public class setMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix ={
            {1,1,1},
            {1,0,1},
            {1,1,1},
        };
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    //row
                    for (int k = 0; k < cols; k++) {
                        if (matrix[i][k] != 0) matrix[i][k] = -1;
                    }
                    //column
                    for (int k = 0; k < rows; k++) {
                        if (matrix[k][j] != 0) matrix[k][j] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j]==-1){
                   matrix[i][j]=0; 
                }
            }
        }

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

    }
}
