public class leetcode35 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        int target = 2;

        int left =0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }else if(arr[mid]<target){
                  left=mid+1;
            }else{
                right=mid-1;
            }
        }
        //If target is not found, return insert position
        System.out.println(left);
    }
}
