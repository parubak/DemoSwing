package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static java.lang.Math.*;

public class RezultButtonListener extends AbstractAction {
    JTextField textField;

    public RezultButtonListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        JButton btn = (JButton) e.getSource();
        Calc.VALUE_2 = Double.parseDouble(textField.getText());


        switch (btn.getText()) {
            case "=": {
                switch (Calc.OPERATION) {
                    case "+":
                        Calc.RESULT = Calc.VALUE_1 + Calc.VALUE_2;
                        break;
                    case "-":
                        Calc.RESULT = Calc.VALUE_1 - Calc.VALUE_2;
                        break;
                    case "*":
                        Calc.RESULT = Calc.VALUE_1 * Calc.VALUE_2;
                        break;
                    case "/":
                        if (Calc.VALUE_1 == 0 || Calc.VALUE_2 == 0) {
                            Calc.RESULT = 0;
                            JOptionPane.showMessageDialog(null,
                                    "Деление на ноль!",
                                    "Error!!!",
                                    JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                        Calc.RESULT = Calc.VALUE_1 / Calc.VALUE_2;
                        break;
                }
                break;
            }
            case "<":
                textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
                return;
            case "C":
                Calc.VALUE_2 = 0;
                Calc.OPERATION = "";
                Calc.RESULT = 0;
                break;
            case "√":
               Calc.RESULT= sqrt(Calc.VALUE_2);
               break;
            case "x2":
                Calc.RESULT= pow(Calc.VALUE_2,2);
                break;
        }

        if (Calc.RESULT % 1 == 0) {
            textField.setText(String.valueOf(((Double) Calc.RESULT).intValue()));
        } else {
            textField.setText(String.valueOf(Calc.RESULT));
        }
        Calc.VALUE_1 = Calc.RESULT;

    }
}
