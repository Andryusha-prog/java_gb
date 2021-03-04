package gui;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    public CalculatorFrame(){
        setTitle("Calculator v1.0");//Заголовок окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//свойство закрытия окна
        setBounds(10,10,300, 500);//начальная точка и размер полотна

        //setLayout(new BorderLayout());//Для расположения элементов по сторонам света, вертикали-горизонтали и т.д... (Центральный элемент занимает больше всего места)
        //add(new JButton("Submit"), BorderLayout.CENTER);//Добавление кнопки
        //add(new JButton("Delete"), BorderLayout.SOUTH);
        //setLayout(new GridLayout(3,3));//таблица для размещения компонент (3х3)
        //setLayout(new FlowLayout());//расположение по размеру полотна

        setLayout(new BorderLayout());//для разметки вложенных фреймов

        TopFrame top = new TopFrame();
        add(top.getPanel(), BorderLayout.NORTH);//отрисовка вложенного фрейма в основной

        BottomFrame bottom = new BottomFrame(top.getInputField());
        add(bottom.getPanel(), BorderLayout.CENTER);

        setVisible(true);//видимость компонентов
    }
}
