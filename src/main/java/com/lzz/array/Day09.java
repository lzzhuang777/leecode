package com.lzz.array;

public class Day09 {

    static int[][] rotate(int[][] matrix) {

        int end = matrix.length - 1;
        for (int i = 0; i < (end/2)+1; i++) {
            for (int j = 0; j < (end+1)/2; j++) {

                int tmp = matrix[i][j];
                matrix[i][j] = matrix[end - j][i];
                matrix[end - j][i] = matrix[end-i][end - j];
                matrix[end-i][end - j] = matrix[j][end-i];
                matrix[j][end-i] = tmp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {

        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate(matrix);
    }

}
