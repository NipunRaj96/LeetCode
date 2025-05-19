// Given an array of integers nums which is sorted in ascending order, and an integer target, 
//write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

public class binary_search { //lc 704
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target= 2;

        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                System.out.println("Target found at: "+mid);
                return;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        System.out.println("-1");
    }
}
