package example_07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    private JLabel moveMeLabel = new JLabel("Move Me!");

    public MainFrame() {
        setTitle("Key Event Example 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(null);

        container.addKeyListener(new KeyAdapter() {

        });

        moveMeLabel.setLocation(50, 50);
        moveMeLabel.setSize(100, 20);

        container.add(moveMeLabel);
        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
