package com.bradchao.java.tutor;

public class ScoreV1 {
    public static void main(String[] args){
        // 0 - 100
        int intScore = (int)(Math.random()*101); // 0.0 ~ 101.0(x)
        System.out.println(intScore);
        if (intScore >= 60){
            System.out.println("Pass");
        }else {
            System.out.println("Down");
        }
    }
}
