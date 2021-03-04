package gui;

import javax.swing.*;
import java.awt.*;

public class TopFrame {
    private final JPanel panel;
    private final JTextField inputField;
    public TopFrame() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());//Расположение внутри фложенного врейма
        inputField = new JTextField();//текстовая панель
        inputField.setEditable(false);//запрет ввода в текстовое поле
        panel.add(inputField, BorderLayout.CENTER);//отрисовка панели во вложенном фрейме
    }

    public JPanel getPanel() {
        return panel;
    }

    public JTextField getInputField() {
        return inputField;
    }
}
