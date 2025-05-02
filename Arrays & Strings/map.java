import java.util.*;
public class map {
    public static void main(String[] args) {
        Map<String,Integer>MyMap=new LinkedHashMap<>();

//HashMap sometimes gives the elements in sorted order or the order u have written or in any order
//LinkedHashMap gives that in the order u have written or added into the set
//TreeMap gives in sorted order 

        MyMap.put("Ashish", 10);
        MyMap.put("tanish", 20);
        MyMap.put("rahul", 30);
        MyMap.put("harsh", 10);
        MyMap.put("kanishk", 40);
        MyMap.put("lokesh", 40);
        MyMap.put("Ashish", 50);

        MyMap.remove("lokesh");

        System.out.println(MyMap);
        System.out.println(MyMap.size());
        System.out.println(MyMap.keySet());
        System.out.println(MyMap.values());

        //traversing
        for (String names : MyMap.keySet()) {
            System.out.println(names);
            System.out.println(MyMap.get(names));
        }
    }
}
