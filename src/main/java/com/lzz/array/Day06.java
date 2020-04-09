package com.lzz.array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Day06 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
       for(int i = 0;i<nums1.length;i++){
           for(int j = 0;j<nums2.length;j++){
               if(nums1[i] == nums2[j]){
                   set.add(nums1[i]);
                   break;
               }
           }
       }
     return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,5};
        int[] nums2 = {4,2,7,5,6,8};



    }
}
