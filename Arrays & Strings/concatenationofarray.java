//COncatenation of array
import java.util.*;

public class concatenationofarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int ans[] = new int[2*arr.length];

        for (int i = 0; i <arr.length; i++) {
            ans[i] = arr[i];        
            ans[i + arr.length] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
