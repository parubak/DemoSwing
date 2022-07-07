package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class OperationButtonListener extends AbstractAction {

    JTextField textField;

    public OperationButtonListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        Calc.OPERATION=btn.getText();
        if (Character.isDigit(textField.getText().charAt(0))) {
            Calc.VALUE_1 = Double.parseDouble(textField.getText());
        }

        textField.setText(btn.getText());
    }
}
