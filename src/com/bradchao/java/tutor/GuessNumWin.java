package com.bradchao.java.tutor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumWin extends JFrame {
    private JTextField input;
    private JButton guess;
    private JTextArea log;
    private String answer;
    private boolean isWinner;

    public GuessNumWin(){
        super("猜數字遊戲");

        setLayout(new BorderLayout());

        JPanel topLine = new JPanel(new BorderLayout());
        input = new JTextField(); guess = new JButton("猜");
        topLine.add(input, BorderLayout.CENTER); topLine.add(guess, BorderLayout.EAST);

        guess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkProcess();
            }
        });

        add(topLine, BorderLayout.NORTH);

        log = new JTextArea();
        add(log, BorderLayout.CENTER);

        setSize(800, 640);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initGame();

    }

    private void initGame(){
        answer = createAnswer(3);
        isWinner = false;
        log.setText("");
    }

    private void checkProcess(){
        String guess = input.getText();
        String result = checkAB(answer, guess);
        if (result.equals("3A0B")){
            JOptionPane.showMessageDialog(this, "恭喜老爺, 賀喜夫人");
        }else {
            JOptionPane.showMessageDialog(this, result);
        }

        log.append(String.format("%s => %s\n", guess, result));
        input.setText("");

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


    public static void main(String[] args){
        new GuessNumWin();
    }
}
