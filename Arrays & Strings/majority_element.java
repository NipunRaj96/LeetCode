import java.util.ArrayList;

public class majority_element {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int n = arr.length;

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == list.get(i)) {
                    count++;
                }
            }
            if (count > n / 2) {
                System.out.println("Majority element: " + list.get(i));
                return;
            }
        }

        System.out.println("No majority element found.");
    }
}