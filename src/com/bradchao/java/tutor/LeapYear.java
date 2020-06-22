package com.bradchao.java.tutor;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year = ");
        int year = scanner.nextInt();

        boolean isLeap;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    isLeap = true;
                }else{
                    isLeap = false;
                }
            }else{
                isLeap = true;
            }
        }else{
            isLeap = false;
        }

//        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
//            // isLeap = true;
//        }else{
//            // isLeap = false;
//        }

        System.out.printf("%d年是%s年", year, isLeap?"閏":"平");

    }
}
