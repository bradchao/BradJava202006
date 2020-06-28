package com.bradchao.java.tutor;

import javax.swing.*;

public class MyWinApp extends JFrame{
    public MyWinApp(){
        super("我的視窗程式");

        setSize(640, 480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new MyWinApp();
    }
}
