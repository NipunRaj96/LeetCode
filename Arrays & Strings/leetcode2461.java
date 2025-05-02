//brut force approach  
public class leetcode2461 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
       // int length = 3;
        int max = 0;
       
        for (int i = 0; i < nums.length-2; i++) {
            int sum=0;
            if(nums[i]!=nums[i+1]&&nums[i+1]!=nums[i+2]&&nums[i]!=nums[i+2]){
               sum = nums[i]+nums[i+1]+nums[i+2];
            }else{
                sum = 0;
            }
            if (sum>=max) {
                max=sum;
            }
        }
        System.out.println(max);
    }
}

