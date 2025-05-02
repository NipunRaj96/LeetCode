//1295. Find Numbers with Even Number of Digits
//Given an array nums of integers, return how many of them contain an even number of digits.

public class leetcode1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,789};
        int count = 0;

        for (int num : nums) {
            String str = String.valueOf(num);
            if(str.length()%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
