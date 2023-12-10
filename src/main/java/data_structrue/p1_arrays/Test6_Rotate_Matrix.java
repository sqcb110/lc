package data_structrue.p1_arrays;

/*
给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
不占用额外内存空间能否做到？
本题与主站 48 题相同：https://leetcode-cn.com/problems/rotate-image/
*/

public class Test6_Rotate_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] rmatrix = rotateMatrix(matrix);
        for (int i = 0; i < rmatrix.length; i++) {
            for (int j = 0; j < rmatrix[i].length; j++) {
                System.out.print(rmatrix[i][j]);
                System.out.println();
            }
        }
    }

    public static int[][] rotateMatrix(int[][] matrix){
        int tmp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < ; j++) {
                
            }
        }

    }
}
