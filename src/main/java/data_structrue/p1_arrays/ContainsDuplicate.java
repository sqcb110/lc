package data_structrue.p1_arrays;

//217. 存在重复元素
//给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。

import java.lang.reflect.Array;
import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 4;
        //
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate2(nums));
    }

    //使用set集合无重复元素的特点
    public static boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();
        for (int num:nums
             ) {
            set.add(num);
        }
        int a = nums.length;
        int b = set.size();
        if (a==b){
            return false;
        }
        return true;
    }

    //使用排序
    public static boolean containsDuplicate2(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
