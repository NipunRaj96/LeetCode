public class richestcustomerwealth {
    public static void main(String[] args) {
        int arr[][] ={
            {2,8,7},
            {7,1,3},
            {1,9,5},
        };
        //rows - 0,1,2
        //columns - 0,1,2
        int maxWealth =0;
        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
            //System.out.println("Sum of "+(i+1)+" account: "+sum);
            maxWealth = Math.max(maxWealth, sum);
        }
        System.out.println(maxWealth);
    }
}
