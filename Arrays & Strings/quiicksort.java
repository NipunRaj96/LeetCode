import java.util.Arrays;

public class quiicksort{
    public static void main(String[] args) {
        int[] arr = {7,4,2,6,1,9,8,5,0};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {21,3,4,55,64,77,2,32,1,45,62,79,89,90,65,42,34,12,33};
        quicksort(arr2, 0, arr2.length-1);
        System.out.println(Arrays.toString(arr2));
    }
    static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }
    static int partition(int[] arr,int low , int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (arr[j]<pivot) {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}    
