package com.bradchao.java.tutor;

import java.util.Scanner;

public class MyAdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("X = ");
        int x = scanner.nextInt();  // 變數命名原則: [a-zA-Z$_][a-zA-Z0-9$_]*
        System.out.print("Y = ");
        int y = scanner.nextInt();

        int result = x + y;
        System.out.printf("%d + %d = %d", x, y, result);
    }
}
