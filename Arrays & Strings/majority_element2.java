import java.util.*;

public class majority_element2 {
  public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,2,2,2};
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int count = 0;

            // Check if already added to result
            if (result.contains(nums[i])) continue;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > n / 3) {
                result.add(nums[i]);
            }
        }

        System.out.println(result);
    }
}
