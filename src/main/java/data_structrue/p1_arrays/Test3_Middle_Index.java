package data_structrue.p1_arrays;

public class Test3_Middle_Index {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(pivotIndex(arr));


    }

    public static int pivotIndex(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            int left = 0;
            int right = 0;
            if(i>0){
                for(int j=0;j<i;j++){
                    left += nums[j];
                }
            }

            if(i<nums.length-1){
                for(int k=i+1;k<nums.length;k++){
                    right += nums[k];
                }
            }

            if(left == right){
                return i;
            }
        }
        return -1;
    }
}
