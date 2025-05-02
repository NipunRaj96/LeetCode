//WAP to print the average of even and odd values of an array separately.
import java.util.*;

public class arrays5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter "+size+" elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is: "+Arrays.toString(arr));
        
        int even_sum=0;
        int odd_sum=0;
        int even_count=0;
        int odd_count=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                even_sum = even_sum + arr[i];
                even_count++;
            }else{
                odd_sum = odd_sum +arr[i];
                odd_count++;
            }
        }
        int even_avg = even_sum/even_count;
        int odd_avg = odd_sum/odd_count;
        System.out.println("Avg of even values: "+even_avg);
        System.out.println("Avg of odd values: "+odd_avg);
        sc.close();
    }
}
