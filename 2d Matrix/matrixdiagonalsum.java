public class matrixdiagonalsum {
        public static void main(String[] args) {
            int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
            };
    
            int sum = 0;
            int n = matrix.length;
    
            for (int i = 0; i < n; i++) {
                sum += matrix[i][i]; // Primary diagonal top left to bottom right
                if (i != n - 1 - i) { // to remove center element in an odd x odd matrix 
                    sum += matrix[i][n - 1 - i]; // Secondary diagonal top right to bottom left 
                }
            }
    
            System.out.println(sum);
        }
}
