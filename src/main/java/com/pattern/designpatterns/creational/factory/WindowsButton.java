package com.pattern.designpatterns.creational.factory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowsButton implements Button {
   JPanel panel=new JPanel();
   JFrame frame=new JFrame();
   JButton  button;

    @Override
    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("Muharrem Koç----I'am Java Developer");
        label.setOpaque(true);
        label.setBackground(new Color(223,125,132));
        label.setFont(new Font("Dialog",Font.BOLD,20));
        label.setVerticalAlignment(SwingConstants.BOTTOM);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.setSize(400,340);
        frame.setVisible(true);
        onClick();
    }

    @Override
    public void onClick() {
        button=new JButton("Quit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });

    }
}
