package data_structrue.p1_arrays;

/*
给你一个大小为 m x n 的矩阵 mat ，请以对角线遍历的顺序，用一个数组返回这个矩阵中的所有元素。
输入：mat = [[1,2,3],[4,5,6],[7,8,9]]
输出：[1,2,4,7,5,3,6,8,9]
输入：mat = [[1,2],[3,4]]
输出：[1,2,3,4]
* */

public class Test8_Matrix_Diagonal_Ergodic {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] arr = diagonalErgodic(mat);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static int[] diagonalErgodic(int[][] mat) {
        int[] arr = new int[mat.length * mat[0].length];
        int index = 0;
        int n = mat.length;
        for (int i = 0; i < n * 2 - 1; i++) {
            for (int j = 0; j < i + 1 & j < 2 * n - i - 1; j++) {
                if (i == 0 & j == 0) {
                    arr[index] = mat[i][j];
                    index++;
                } else if (i < n & i % 2 == 1) {
                    arr[index] = mat[j][i - j];
                    index++;
                } else if (i < n & i % 2 == 0) {
                    arr[index] = mat[i - j][j];
                    index++;
                } else if (i >= n & i % 2 == 1) {
                    arr[index] = mat[j + 1 + i - n][n - j - 1];
                    index++;
                }else{
                    arr[index] = mat[n - j - 1][j + 1 + i - n];
                    index++;
                }
            }
        }

        return arr;
    }
}
