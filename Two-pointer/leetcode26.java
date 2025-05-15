import java.util.ArrayList;

public class leetcode26 {
    public static void main(String[] args) {
        int[] nums= {0,0,1,1,1,2,2,3,3,4};
        ArrayList<Integer>nums_list=new ArrayList<>();
        for (Integer num : nums) {
            nums_list.add(num);
        }
        System.out.println(nums_list);
        for (int i = 0; i < nums_list.size()-1; i++) {
            if (nums_list.get(i)==nums_list.get(i+1)) {
                nums_list.remove(i);
                i--;
            }
        }
        System.out.println(nums_list);
    }
}
