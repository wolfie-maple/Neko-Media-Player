package com.barrelofkittens;


import javax.swing.*;
import java.awt.*;

public class TopLevelWindow {


    static void CreateWindow(){
        JFrame frame = new JFrame("Neko Media Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textLabel = new JLabel("test label",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(textLabel, BorderLayout.LINE_START);

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
