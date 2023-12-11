package data_structrue.p1_arrays;

/*
给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
不占用额外内存空间能否做到？
本题与主站 48 题相同：https://leetcode-cn.com/problems/rotate-image/
*/

public class Test6_Rotate_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] rmat = rotateMatrix(matrix);
        for (int i = 0; i < rmat.length; i++) {
            for (int j = 0; j < rmat[i].length; j++) {
                System.out.print(rmat[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] matrix){
        int tmp;
        int n = matrix.length;
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n - 1 -i; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = tmp;
            }
        }
        return matrix;

    }
}
