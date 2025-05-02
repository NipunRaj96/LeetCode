import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        List<Integer>Mylist = new ArrayList<>();
        Mylist.add(5);
        Mylist.add(3);
        Mylist.add(2);
        Mylist.add(7);

        int[] arr = {5,3,2,7};

        System.out.println("Lenght of arrays i: "+arr.length);
        System.out.println("Size of list is: "+Mylist.size());
        System.out.println(Mylist);
    }
}
