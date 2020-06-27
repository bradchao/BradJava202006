package com.bradchao.java.tutor;

import java.util.Scanner;

public class CountTestV1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int num = scanner.nextInt();
        int i = 1;
        int sum = 0;
        while (i<=num){
            sum += i++;
        }
        System.out.printf("1 + 2 + ... + %d = %d", num, sum);

    }
}
