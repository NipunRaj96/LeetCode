import java.util.Arrays;

public class runningsum {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] running_sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i==0){
                running_sum[i]=nums[i];
            }else{
                running_sum[i]=running_sum[i-1]+nums[i];
            }
        }
        System.out.println(Arrays.toString(running_sum));
    }
}
