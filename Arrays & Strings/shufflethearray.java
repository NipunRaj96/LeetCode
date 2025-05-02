//Shuffle the array {Leetcode}
import java.util.*;

public class shufflethearray {
    public static void main(String[] args) {
        int arr[] ={2,5,1,3,4,7};
        int n = arr.length/2;

        int result[] = new int[arr.length];
        for (int i = 0; i < n; i++) {
            result[2*i] = arr[i];
            result[2*i+1] = arr[i+n];

        }

        System.out.println(Arrays.toString(result));
    }
}
