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
            @Override
            public void keyReleased(KeyEvent e) {
                int r = (int) (Math.random() * 256);
                int g = (int) (Math.random() * 256);
                int b = (int) (Math.random() * 256);

                switch (e.getKeyChar()) {
                    case '\n':
                        String hexCode = "#%02X%02X%02X";
                        hexCodeLabel.setText(String.format(hexCode, r, g, b));
                        getContentPane().setBackground(new Color(r, g, b));
                        break;
                    case 'q':
                        System.exit(0);
                }
            }
        });

        setSize(500, 300);
        setVisible(true);

        container.setFocusable(true);
        container.requestFocus();
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
