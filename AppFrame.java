package com.game;

import javax.swing.JFrame;

public class AppFrame extends JFrame{
    AppFrame(){
        setTitle("2D car racing game");
        setSize(500,500);
        setLocationRelativeTo(null);
        AppPanel aPanel = new AppPanel();
        add(aPanel);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}