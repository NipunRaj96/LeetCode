import java.util.Arrays;
import java.util.Scanner;

public class leetcode303 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5,6,7,0};
        int[] prefixSum = new int[arr.length];
        prefixSum[0]=arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(prefixSum));

        //lets take that we need sum from index 3 to 6
        int rangeSum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Left: ");
        int Left = sc.nextInt();
        System.out.println("Enter Right: ");
        int Right = sc.nextInt();
        
        if(Left==0){
            rangeSum = prefixSum[Right];
        }else{
            rangeSum = prefixSum[Right]-prefixSum[Left-1];
        }

        System.out.println("Sum from "+Left+" to "+Right+" is: "+rangeSum);
        sc.close();
    }
}
