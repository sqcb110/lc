package data_structure.p1_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Test5_Merge_Intervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(intervals.length);
        int[][] merge = merge(intervals);
        System.out.println(merge.length);
    }

    public static int[][] merge(int[][] arr) {
        if(arr.length <= 1){return arr;}
        //排序
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        //合并区间
        int[] ints = arr[0]; //用于比较，临时存放第一个一维数组
        ArrayList<int[]> listArr = new ArrayList<>(); //存放合并区间后的数组
        for (int i = 1; i < arr.length; i++) {
            if(ints[1] >= arr[i][0]){ //左区间最大数>=右区间最小数，有重叠
                ints[1] = Math.max(ints[1],arr[i][1]); //两个区间最大数的较大者，作为合并后的区间最大数
            }else{
                listArr.add(ints); //没有重叠，左区间放入合并后数组
                ints=arr[i]; //右区间作为新的左区间，参与下一轮比较。
            }
        }
        listArr.add(ints);//循环结束，将最后的区间放入合并后的数组
        return listArr.toArray(new int[listArr.size()][2]);
    }


    /*
class Solution {
    public int[][] merge(int[][] arr) {
        if (arr.length <= 1) {return arr;}
        //排序
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) { //o2 是 o1 的前一个一维数组
                if (o2[0] == o1[0]) { //一维数组第一个数相等,比较第二个数
                    return o1[1] - o2[1]; //返回负数则调换一维数组地址,即从小到大排序
                }
                return o1[0] - o2[0];
            }
        });
        //合并区间
        int[] ints = arr[0]; //进行比较,先存放第一个一维数组的起始地址
        ArrayList<int[]> list = new ArrayList<>(); //存放长度未知的一维数组
        for (int i = 1; i < arr.length; i++) {
            if (ints[1] >= arr[i][0]) { //左区间最大数 >= 右区间最小数,有交集
                ints[1] = Math.max(arr[i][1],ints[1]); //获得两区间的最大数
            } else {
                list.add(ints); //没有交集,把左区间放入集合
                ints = arr[i]; //重新赋值为右区间
            }
        }
        list.add(ints); //循环结束,把最后的区间放入集合
        return list.toArray(new int[list.size()][2]);
        }
}

链接：https://leetcode.cn/leetbook/read/array-and-string/c5tv3/?discussion=2wFR9V

    * */
}
