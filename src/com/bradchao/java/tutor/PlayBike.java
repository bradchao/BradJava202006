package com.bradchao.java.tutor;

import com.bradchao.java.myutils.Bike;

public class PlayBike {
    public static void main(String[] args){
        Bike myBike = new Bike();
        Bike urBike = new Bike();
        System.out.println(myBike.getSpeed());
        System.out.println(urBike.getSpeed());
        myBike.upSpeed();
        System.out.println(myBike.getSpeed());
        System.out.println(urBike.getSpeed());

        myBike.upSpeed();myBike.upSpeed();urBike.upSpeed();
        System.out.println(myBike.getSpeed());
        System.out.println(urBike.getSpeed());

        myBike.downSpeed();
        System.out.println(myBike.getSpeed());
        System.out.println(urBike.getSpeed());

    }
}
