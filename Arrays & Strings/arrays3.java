//WAP to input an array from the user and print its reverse.
import java.util.*;

public class arrays3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of the array: ");
    int size= sc.nextInt();

    int arr[] = new int[size];

    System.out.println("Array is: ");

    for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println("Array is: "+Arrays.toString(arr));

    int rev_arr[] = new int[size];

    for (int i = 0; i < size; i++) {
        rev_arr[i] = arr[size - 1 - i]; 
    }

    System.out.println("Reverse array is: "+Arrays.toString(rev_arr));
    sc.close();
  }
}
    

