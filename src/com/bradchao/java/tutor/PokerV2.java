package com.bradchao.java.tutor;

public class PokerV2 {
    public static void main(String[] args){
        int[] poker = new int[52];
        //for (int i=0; i<poker.length; i++) System.out.printf("poker[%d] = %d\n", i, poker[i]);

        boolean isRepeat;
        int rand;
        for (int i=0; i<poker.length; i++){
            do {
                rand = (int) (Math.random() * 52); // 0 - 51

                // 檢查機制
                isRepeat = false;
                for (int j = 0; j < i; j++) {
                    if (rand == poker[j]) {
                        isRepeat = true;
                        break;
                    }
                }
            }while(isRepeat);
            poker[i] = rand;
        }
        for (int i=0; i<poker.length; i++) System.out.printf("poker[%d] = %d\n", i, poker[i]);

    }

}
