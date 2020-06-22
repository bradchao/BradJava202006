package com.bradchao.java.tutor;

import java.util.Scanner;

public class MyMath {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("X = ");
        int x = scanner.nextInt();  // 變數命名原則: [a-zA-Z$_][a-zA-Z0-9$_]*
        System.out.print("Y = ");
        int y = scanner.nextInt();

        int r1 = x + y;
        int r2 = x - y;
        int r3 = x * y;
        int r4 = x / y;
        int r5 = x % y; // 取餘數
        double r6 = x * 1.0 / y;

        System.out.printf("%d + %d = %d\n", x, y, r1);
        System.out.printf("%d - %d = %d\n", x, y, r2);
        System.out.printf("%d x %d = %d\n", x, y, r3);
        System.out.printf("%d / %d = %d ...... %d\n", x, y, r4, r5);
        System.out.printf("%d / %d = %f\n", x, y, r6);
    }
}
