import java.util.ArrayList;
import java.util.List;

public class targetarrayingivenorder {
    public static void main(String[] args) {
        int num[] = {0,1,2,3,4};
        int index[] = {0,1,2,2,1};

        List<Integer>ans_list = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            ans_list.add(index[i],num[i]);
        }

        System.out.println(ans_list);
    }
}
