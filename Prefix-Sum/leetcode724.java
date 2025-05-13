public class leetcode724 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,0};
        int arrSum=0;
        for (int nums : arr) {
            arrSum = arrSum+nums;
        }
        System.out.println(arrSum);
        
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = arrSum - leftSum - arr[i];

            if(rightSum==leftSum){
                System.out.println("equilibrium found at: "+i);
                return;
            }else{
                leftSum = leftSum+arr[i];
            }
        }
    }
}
