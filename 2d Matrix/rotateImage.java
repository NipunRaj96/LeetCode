import java.util.Arrays;

public class rotateImage {
    public static void main(String[] args) {
        int[][] original = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int rows = original.length;
        int cols = original[0].length;
        int temp;
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j]=original[j][i];
            }
        }
        for (int i = 0; i < cols; i++) {
            temp = arr[i][0];
            arr[i][0] = arr[i][2];
            arr[i][2] = temp;

        }

        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
