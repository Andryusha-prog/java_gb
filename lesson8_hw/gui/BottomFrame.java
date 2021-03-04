package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomFrame {
    private final JPanel panel;
    private double temp;
    private int choise = 0;//переменная, которая отвечает за выбор действия в функции
    private double result;

    public BottomFrame(JTextField inputField) {
        panel = new JPanel();
        JPanel bottom = new JPanel();
        panel.setLayout(new GridLayout(6, 3));
        DigitButtonListener buttonListener = new DigitButtonListener(inputField);
        for (int i = 0; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(buttonListener);
            panel.add(btn);
        }

        JButton equal = new JButton("=");
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resh(inputField);
                inputField.setText(String.valueOf(result));
                choise = 0;
            }
        });
        panel.add(equal);


        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
                choise = 0;
            }
        });
        panel.add(clear);

        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resh(inputField);
                choise = 1;
                inputField.setText("");
            }
        });
        panel.add(plus);


        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resh(inputField);
                choise = 2;
                inputField.setText("");
            }
        });
        panel.add(minus);

        JButton multi = new JButton("*");
        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resh(inputField);
                choise = 3;
                inputField.setText("");
            }
        });
        panel.add(multi);


        JButton div = new JButton("/");
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resh(inputField);
                choise = 4;
                inputField.setText("");
            }
        });
        panel.add(div);


        JButton sqrt = new JButton("SQRT");//решение 3 задания
        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = Math.sqrt(Double.valueOf(inputField.getText()));
                inputField.setText(String.valueOf(result));
            }
        });
        panel.add(sqrt);


        JButton delimeter = new JButton(".");//добавил разделитель целой и дробной части по второму заданию
        delimeter.addActionListener(buttonListener);
        panel.add(delimeter);
    }

    public JPanel getPanel() {
        return panel;
    }

    public void resh(JTextField inputField) {
        temp = Double.valueOf(inputField.getText());
        switch (choise) {
            case 1:
                result += temp;
                break;
            case 2:
                result -= temp;
                break;
            case 3:
                result *= temp;
                break;
            case 4:
                result /= temp;
                break;
            default:
                result = temp;
        }
    }
}
