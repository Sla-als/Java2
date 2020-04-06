package GeekBrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
public MyWindow() {
    setTitle("Window");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setBounds(300, 300, 600, 400);


    JButton jbs = new JButton();
    JTextArea jta = new JTextArea();
    JScrollPane jsp = new JScrollPane(jta);
    JTextField field = new JTextField();

    setLayout(null);


    // textarea
    jta = new JTextArea("Enter your message...");
    add(jta);
    jta.setBounds(100, 50, 400, 200);
        //jta.setLayout(new BorderLayout()); не понял как включить скролл если так, то нельзя ничего ввести
        //jta.add(jsp);

    // ввод
    add(field);
    field.setBounds(100,260,300,50);
    JTextArea finalJta = jta;
    field.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Your message: " + field.getText());
            finalJta.append("\n"+field.getText());
        }
    });
    // send
    jbs = new JButton("Send");
    add(jbs);
    jbs.setBounds(410, 260, 90, 50);
    jbs.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Your message: " + field.getText());
            finalJta.append("\n"+field.getText());

        }
    });

    JButton button = new JButton("Button");
    add(button);
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            finalJta.append("\n"+field.getText());
        }
    });


    setVisible(true); // видимость формы на экране. Лучше вызывать последней
}
}// class
