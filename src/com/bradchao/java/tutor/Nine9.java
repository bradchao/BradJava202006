package com.bradchao.java.tutor;

public class Nine9 {
    public static void main(String[] args){
        int rows = 1;
        int start = 1;
        int cols = 9;

        for (int k=0; k<rows; k++) {
            for (int j = 1; j <= 9; j++) {
                for (int i = start; i < start+cols; i++) {
                    int newi = i + k * cols;
                    int result = newi * j;
                    System.out.printf("%d x %d = %d\t", newi, j, result);
                }
                System.out.println();
            }
            System.out.println("---");
        }
    }
}
