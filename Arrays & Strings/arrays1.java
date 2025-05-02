//WAP to input an array from the user and print all its values.

import java.util.*;
public class arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
//input loop
        for (int i = 0; i < size ; i++) {
            arr[i]=sc.nextInt();
        }
        
        System.out.print("Array is: ");
//output loop
        for (int i = 0; i < size; i++) {
            if(i != size-1){
            System.out.print(arr[i]+" ");
            }else{
                System.out.println(arr[i]);
            }
        }
    sc.close();


    }
}
