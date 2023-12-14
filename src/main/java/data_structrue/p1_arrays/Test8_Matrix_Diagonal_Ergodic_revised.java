package data_structrue.p1_arrays;

/*
给你一个大小为 m x n 的矩阵 mat ，请以对角线遍历的顺序，用一个数组返回这个矩阵中的所有元素。
输入：mat = [[1,2,3],[4,5,6],[7,8,9]]
输出：[1,2,4,7,5,3,6,8,9]
输入：mat = [[1,2],[3,4]]
输出：[1,2,3,4]
* */

public class Test8_Matrix_Diagonal_Ergodic_revised {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] arr = diagonalErgodic(mat);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[] arr1 = diagonalErgodic(mat1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println();
        int[][] mat2 = {{1, 2}, {4, 5}, {7, 8}};
        int[] arr2 = diagonalErgodic(mat2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
    }

    public static int[] diagonalErgodic(int[][] mat) {
        int index = 0;
        int n = mat.length;
        int m = mat[0].length;
        int mvnb = Math.max(m, n);
        int mvns = Math.min(m, n);
        int[] arr = new int[m * n];
        for (int i = 0; i < m + n - 1; i++) {
            for (int j = 0; j < i + 1 & j < m + n - i - 1 & j < mvns; j++) {
                if (i < mvns & i % 2 == 1) { //开始阶段
                    arr[index] = mat[j][i - j];
                    index++;
                } else if (i < mvns & i % 2 == 0) { //开始阶段
                    arr[index] = mat[i - j][j];
                    index++;
                } else if (i >= mvns & i < mvnb & m >= n & i % 2 == 1) { //中间阶段1
                    arr[index] = mat[j][i - j];
                    index++;
                } else if (i >= mvns & i < mvnb & m >= n & i % 2 == 0) { //中间阶段1
                    arr[index] = mat[n - 1 - j][i - n + 1 + j];
                    index++;
                } else if (i >= mvns & i < mvnb & m <= n & i % 2 == 1) { //中间阶段2
                    arr[index] = mat[i - mvns + 1 + j][mvns - 1 - j];
                    index++;
                } else if (i >= mvns & i < mvnb & m <= n & i % 2 == 0) { //中间阶段2
                    arr[index] = mat[i - j][j];
                    index++;
                } else if (i >= mvnb & i % 2 == 1) { //结尾阶段
                    arr[index] = mat[i - m + 1 + j][m - 1 - j];
                    index++;
                } else if (i >= mvnb & i % 2 == 0) { //结尾阶段
                    arr[index] = mat[n - 1 - j][i - n + 1 + j];
                    index++;
                }
            }
        }

        return arr;
    }
}
