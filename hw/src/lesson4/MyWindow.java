package lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JButton jbs = new JButton("SEND");
        jbs.setBounds(0,0,30,10);

        setLayout(new BorderLayout());   // выбор компоновщика элементов

        JTextField field = new JTextField();
        JLabel jlab = new JLabel("Please enter your first message...", SwingConstants.LEFT);
        jlab.setVerticalAlignment(SwingConstants.TOP);

        JPanel p = new JPanel(new GridLayout(2, 1, 4, 4));
        p.add(field);
        p.add(jbs);

//        add(jbs, BorderLayout.EAST);  // добавление кнопки на форму
        add(jlab, BorderLayout.CENTER);
        add(p, BorderLayout.SOUTH);

        jbs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("User: " + field.getText());
                field.setText(" ");
            }
        });

        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("User: " + field.getText());
                field.setText(" ");
            }
        });

        setVisible(true);

        //вроде все норм

    }
}
