public class binary_search {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5,6};
        int target = 5;
        int n = arr.length-1;
        int left = 0, right = n, mid = 0;
        
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                return;
            }
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println("Not found");
    }
}
