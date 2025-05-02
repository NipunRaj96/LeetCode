//divide an array into equal pairs
import java.util.*;

public class divideanarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;

        int firsthalf[] = Arrays.copyOfRange(arr, 0, n/2);
        int secondhalf[] = Arrays.copyOfRange(arr, n/2, n);

        System.out.println("First half is: "+Arrays.toString(firsthalf));
        System.out.println("Second half is: "+Arrays.toString(secondhalf));
    }
}
