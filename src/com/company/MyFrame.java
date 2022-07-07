package com.company;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    
    final static int WIDHT=250;
    final static int HEIGHT=250;

    JTextField textField=new JTextField();

    public MyFrame(){
        setLocationByPlatform(true);
        setSize(WIDHT,HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField.setText(String.valueOf(0));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.BLACK);

        getContentPane().add(textField, BorderLayout.PAGE_START);
        getContentPane().add(new CalcButtonsPanel(textField), BorderLayout.CENTER);

        setVisible(true);
    }
}
