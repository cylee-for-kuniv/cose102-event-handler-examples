package example_06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    private JLabel hexCodeLabel = new JLabel("Press <Enter> to change color");

    public MainFrame() {
        setTitle("Key Event Example 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(hexCodeLabel);

        container.addKeyListener(new KeyAdapter() {

        });

        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
