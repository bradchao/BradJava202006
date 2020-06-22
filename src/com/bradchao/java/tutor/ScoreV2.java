package com.bradchao.java.tutor;

public class ScoreV2 {
    public static void main(String[] args){
        // 0 - 100
        int intScore = (int)(Math.random()*101); // 0.0 ~ 101.0(x)
        System.out.println(intScore);

        if (intScore >= 90){
            System.out.println("A");
        }else if (intScore >= 80){
            System.out.println("B");
        }else if (intScore >= 70){
            System.out.println("C");
        }else if (intScore >= 60){
            System.out.println("D");
        }else{
            System.out.println("E");
        }

    }
}
