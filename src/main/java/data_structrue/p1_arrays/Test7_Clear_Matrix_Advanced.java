package data_structrue.p1_arrays;

import java.util.HashSet;

public class Test7_Clear_Matrix_Advanced {
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
        boolean[] rows = new boolean[matrix.length];
        boolean[] lines = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    lines[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rows[i] | lines[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
