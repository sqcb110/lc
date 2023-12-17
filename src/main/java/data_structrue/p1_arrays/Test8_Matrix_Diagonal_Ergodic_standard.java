package data_structrue.p1_arrays;

/*
给你一个大小为 m x n 的矩阵 mat ，请以对角线遍历的顺序，用一个数组返回这个矩阵中的所有元素。
输入：mat = [[1,2,3],[4,5,6],[7,8,9]]
输出：[1,2,4,7,5,3,6,8,9]
输入：mat = [[1,2],[3,4]]
输出：[1,2,3,4]
* */

public class Test8_Matrix_Diagonal_Ergodic_standard {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] arr = findDiagonalOrder(mat);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[] arr1 = findDiagonalOrder(mat1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println();
        int[][] mat2 = {{1, 2}, {4, 5}, {7, 8}};
        int[] arr2 = findDiagonalOrder(mat2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
    }


    static int[] nums;
    static int index = 0;
        public static int[] findDiagonalOrder(int[][] mat) {
            index = 0;
            nums = new int[mat.length * mat[0].length];
            if(nums.length == 0){
                return new int[0];
            }
            dfs(mat, 0, 0);
            return nums;
        }

        public static void dfs(int[][] map, int row, int col) {
            if (row == map.length - 1 && col == map[0].length - 1) {
                nums[index] = map[row][col];
                return;
            }
            int i = 0;
            while (row - i >= 0 && col + i < map[0].length) {
                nums[index++] = map[row - i][col + i];
                i++;
            }
            if (row - i < 0 && col + i < map[0].length) {
                row = row - i + 1;
                col = col + i;
            } else {
                row = row - i + 2;
                col = col + i - 1;
            }
            if (row == map.length - 1 && col == map[0].length - 1) {
                nums[index] = map[row][col];
                return;
            }
            i = 0;
            while (row + i < map.length && col - i >= 0) {
                nums[index++] = map[row + i][col - i];
                i++;
            }
            if (col - i < 0 && row + i < map.length) {
                col = col - i + 1;
                row = row + i;
            } else {
                col = col - i + 2;
                row = row + i - 1;
            }
            dfs(map, row, col);
        }
}
