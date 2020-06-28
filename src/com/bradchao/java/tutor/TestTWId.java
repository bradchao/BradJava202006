package com.bradchao.java.tutor;

import com.bradchao.java.myutils.TWId;

public class TestTWId {
    public static void main(String[] args){
//        String myID = "M140051652";
//        if (TWId.checkId(myID)){
//            System.out.print("OK");
//        }else{
//            System.out.print("XX");
//        }

        TWId myID1 = new TWId();
        TWId myID2 = new TWId(true);
        TWId myID3 = new TWId(3);
        TWId myID4= new TWId(3,false);
        TWId myID5= TWId.createTWId("A123456780");

        System.out.println(myID1.getId());
        System.out.println(myID2.getId());
        System.out.println(myID3.getId());
        System.out.println(myID4.getId());
        System.out.println(myID5);



    }
}
