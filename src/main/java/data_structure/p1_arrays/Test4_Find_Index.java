package data_structure.p1_arrays;

/*
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
请必须使用时间复杂度为 O(log n) 的算法。

作者：LeetCode
链接：https://leetcode.cn/leetbook/read/array-and-string/cxqdh/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
* */

public class Test4_Find_Index {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,6};
        int target1 = 5;
        int[] nums2 = {1,3,5,6};
        int target2 = 2;
        int[] nums3 = {1,3,5,6};
        int target3 = 7;
        System.out.println(searchInsert(nums1,target1));
        System.out.println(searchInsert(nums2,target2));
        System.out.println(searchInsert(nums3,target3));

    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right)/2;
        if(target <= nums[left] ){
            return 0;
        }
        if(target > nums[right]){
            return right + 1;
        }
        if(target == nums[right]){
            return right;
        }
        while(left < right){
            if(target == nums[mid]){
                return mid;
            }
            if(right == left + 1 && target >= nums[left] && target <= nums[right]){
                return right;
            }
            if(target < nums[mid]){
                right = mid;
                mid = (left + right)/2;
            }
            if(target > nums[mid]){
                left = mid;
                mid = (left + right)/2;
            }
        }
        return mid;
    }
}
