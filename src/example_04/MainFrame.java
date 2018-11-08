package example_04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    private JLabel helloLabel = new JLabel("Hello");

    public MainFrame() {
        setTitle("MouseListener Example 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
//        container.addMouseListener();

        container.setLayout(null);

        helloLabel.setSize(50, 20);
        helloLabel.setLocation(30, 30);
        container.add(helloLabel);

        setSize(200, 200);
        setVisible(true);
    }

    class MouseHandler {

    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
