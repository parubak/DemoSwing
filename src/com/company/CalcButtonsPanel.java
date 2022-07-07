package com.company;

import javax.swing.*;
import java.awt.*;

public class CalcButtonsPanel extends JPanel {
    JTextField textField;


    JButton btn_0 = new JButton("0");
    JButton btn_1 = new JButton("1");
    JButton btn_2 = new JButton("2");
    JButton btn_3 = new JButton("3");
    JButton btn_4 = new JButton("4");
    JButton btn_5 = new JButton("5");
    JButton btn_6 = new JButton("6");
    JButton btn_7 = new JButton("7");
    JButton btn_8 = new JButton("8");
    JButton btn_9 = new JButton("9");

    JButton btn_add = new JButton("+");
    JButton btn_sub = new JButton("-");
    JButton btn_mul = new JButton("*");
    JButton btn_div = new JButton("/");
    JButton btn_res = new JButton("=");
    JButton btn_dot = new JButton(".");

    JButton btn_del = new JButton("<");
    JButton btn_cancel = new JButton("C");
    JButton btn_x2 = new JButton("x2");
    JButton btn_cor = new JButton("√");



    public CalcButtonsPanel(JTextField textField){
    this.textField = textField;
    NumberButtonListener numberButtonListener=new NumberButtonListener(textField);
    OperationButtonListener operationButtonListener = new OperationButtonListener(textField);
    RezultButtonListener rezultButtonListener=new RezultButtonListener(textField);

    setLayout(new GridLayout(5,4));

    add(btn_del);
    btn_del.addActionListener(rezultButtonListener);
    add(btn_cor);
    btn_cor.addActionListener(rezultButtonListener);
    add(btn_x2);
    btn_x2.addActionListener(rezultButtonListener);
    add(btn_cancel);
    btn_cancel.addActionListener(rezultButtonListener);

    add(btn_7);
    btn_7.addActionListener(numberButtonListener);
    add(btn_8);
    btn_8.addActionListener(numberButtonListener);
    add(btn_9);
    btn_9.addActionListener(numberButtonListener);
    add(btn_div);
    btn_div.addActionListener(operationButtonListener);

    add(btn_4);
    btn_4.addActionListener(numberButtonListener);
    add(btn_5);
    btn_5.addActionListener(numberButtonListener);
    add(btn_6);
    btn_6.addActionListener(numberButtonListener);
    add(btn_mul);
    btn_mul.addActionListener(operationButtonListener);

    add(btn_1);
    btn_1.addActionListener(numberButtonListener);
    add(btn_2);
    btn_2.addActionListener(numberButtonListener);
    add(btn_3);
    btn_3.addActionListener(numberButtonListener);
    add(btn_sub);
    btn_sub.addActionListener(operationButtonListener);


    add(btn_dot);
    btn_dot.addActionListener(numberButtonListener);
    add(btn_0);
    btn_0.addActionListener(numberButtonListener);
    add(btn_res);
    btn_res.addActionListener(rezultButtonListener);
    add(btn_add);
    btn_add.addActionListener(operationButtonListener);
    }
}
