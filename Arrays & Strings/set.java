import java.util.*;
public class set {
    public static void main(String[] args) {
        Set<Integer>MySet= new LinkedHashSet<>();

//HashSet sometimes gives the elements in sorted order or the order u have written or in any order
//LinkedHashSet gives that in the order u have written or added into the set
//TreeSet gives in sorted order 

        MySet.add(2);
        MySet.add(3);
        MySet.add(2);
        MySet.add(4);
        MySet.add(1);
        System.out.println(MySet);

        for(int nums : MySet){
            System.out.println(nums);
        }

    }
}
