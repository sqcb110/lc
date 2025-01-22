package data_structure.p1_arrays;

//编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。

import java.util.HashSet;

public class Test7_Clear_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<Integer>();
        HashSet<Integer> lines = new HashSet<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    lines.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rows.contains(i) | lines.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
/*        for (Integer itg: rows) {
            for (int i = 0; i < matrix[itg.intValue()].length; i++) {
                matrix[itg.intValue()][i] = 0;
            }
        }

        for (Integer itg: lines) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][itg.intValue()] = 0;
            }
        }*/
    }
}
