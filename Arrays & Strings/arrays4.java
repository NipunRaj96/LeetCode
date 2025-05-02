//WAP to print the sum of even and odd values of an array given by the user.

import java.util.*;
public class arrays4 {
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

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                even_sum = even_sum + arr[i];
            }else{
                odd_sum = odd_sum + arr[i];
            }
        }
        System.out.println("Sum of even values: "+even_sum);
        System.out.println("Sum of odd values: "+odd_sum);
        sc.close();
    }
}
