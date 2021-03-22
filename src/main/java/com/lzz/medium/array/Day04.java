package com.lzz.medium.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lzz
 * @version 1.0
 * @date 2021/3/18 11:24
 */
public class Day04 {


    public void setZeroes(int[][] matrix) {
        int C  = matrix.length;
        Set<Integer> setRow = new HashSet<Integer>();
        Set<Integer> setCol = new HashSet<Integer>();
        for(int i = 0; i<C;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    setRow.add(j);
                    setCol.add(i);
                }
            }
        }
        for(int i = 0; i<C;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(setRow.contains(j)||setCol.contains(i)){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
