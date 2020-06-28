package com.bradchao.java.tutor;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("請問猜幾碼 = ");
        int len = scanner.nextInt();
        String answer = createAnswer(len);
        //System.out.println(answer);

        boolean isWinner = false;
        for (int i=0; i<10; i++){
            System.out.print((i+1) + ". 猜 = ");
            String guess = scanner.next();
            String result = checkAB(answer, guess);
            System.out.printf("%s => %s\n", guess, result);

            if (result.equals(len + "A0B")){
                isWinner = true;
                break;
            }
        }

        if (isWinner){
            System.out.println("恭喜老爺, 賀喜夫人!");
        }else{
            System.out.println("可惜! 差一點就成功, 答案是: " + answer);
        }

    }

    static String checkAB(String a, String g){
        int A, B; A = B = 0;
        for (int i=0; i<a.length(); i++){
            if (a.charAt(i) == g.charAt(i)){
                A++;
            }else if (a.indexOf(g.charAt(i)) != -1){
                B++;
            }
        }
        return A + "A" + B + "B";
    }

    static String createAnswer(int d){
        int[] poker = new int[10];
        for (int i=0;i<poker.length; i++) poker[i]=i;

        for (int i = poker.length-1; i>0; i-- ){
            int rand = (int)(Math.random()*(i+1));
            int temp = poker[rand];
            poker[rand] = poker[i];
            poker[i] = temp;
        }

        StringBuffer sb = new StringBuffer();
        for (int i=0; i<d; i++) sb.append(poker[i]);

        return sb.toString();
    }


}
