//1313. Decompress Run-Length Encoded List
import java.util.*;

public class leetcode1313 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};  //output={2,4,4,4} -> 1 times 2 ,3 times 4
    
        List<Integer>res_list = new ArrayList<>();
        for(int i = 0 ; i<arr.length ; i+=2){
            for (int j = 0; j < arr[i]; j++) {
                res_list.add(arr[i+1]);
            }
        }
       System.out.println(res_list);
    }
}
