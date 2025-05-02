//Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in non-decreasing order, 
// find the starting and ending position of a given target value.

import java.util.*;
public class leetcode34 {
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,8,9};
        int target = 8;
        List<Integer>ans_list = new ArrayList<>();
//array length = 7
//n = 6
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                ans_list.add(i);
            }
        }
        System.out.println(Arrays.asList(ans_list.get(0), ans_list.get(ans_list.size()-1)));
    }
}
