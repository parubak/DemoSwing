package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class NumberButtonListener extends AbstractAction {
    JTextField textField;

    public NumberButtonListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        JButton btn = (JButton) e.getSource();

        if (text.equals("0")) {
            if (btn.getText().equals(".")) {
                textField.setText("0" + btn.getText());
                return;
            } else {
                text = "";
            }
        }

        if (!text.isEmpty()&&!Character.isDigit(text.charAt(0))) {
            text = "";
        }

        if (btn.getText().equals(".") && text.contains(".")) {
            return;
        } else {
            textField.setText(text + btn.getText());
        }

    }
}

