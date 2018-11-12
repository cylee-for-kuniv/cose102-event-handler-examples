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
            @Override
            public void keyReleased(KeyEvent e) {
                int xCoord = moveMeLabel.getX();
                int yCoord = moveMeLabel.getY();

                switch(e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        yCoord -= 10;
                        break;
                    case KeyEvent.VK_DOWN:
                        yCoord += 10;
                        break;
                    case KeyEvent.VK_LEFT:
                        xCoord -= 10;
                        break;
                    case KeyEvent.VK_RIGHT:
                        xCoord += 10;
                        break;
                }

                moveMeLabel.setLocation(xCoord, yCoord);
            }
        });

        moveMeLabel.setLocation(50, 50);
        moveMeLabel.setSize(100, 20);

        container.add(moveMeLabel);
        setSize(500, 300);
        setVisible(true);

        container.setFocusable(true);
        container.requestFocus();
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
