package com.lzz.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day06 {

    /**
     *  数组的交集
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
     HashSet<Integer> set1 = new HashSet<>();
     HashSet<Integer> set2 = new HashSet<>();
     for(int num : nums1) {
         set1.add(num);
     }
     for(int num2 :nums2)set2.add(num2);
     if(set1.size()>set2.size())
         return compare(set2,set1);
     else
         return  compare(set1,set2);
    }
    static int[] compare(HashSet<Integer> set1,HashSet set2){
        int[] result = new int[set1.size()];
        int d = 0;
        for(int num : set1){
            if(set2.contains(num)){
                result[d++]= num;
            }
        }
        return Arrays.copyOf(result,d) ;
    }



    public static void main(String[] args) {
        int[] nums1 = {1,2,2,5,4,7,9,6,4};
        int[] nums2 = {4,2,7,6,8,5,8,4,6,1,7,3,2,5,0};
        long start_time = System.currentTimeMillis();
        System.out.println(intersect(nums1,nums2).length);
        System.out.println(+(System.currentTimeMillis()-start_time)/1000+"ms");

    }
}
