package example_05;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Mouse Event Example 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        ColorPanel colorPanel = new ColorPanel();
        this.add(colorPanel, BorderLayout.NORTH);

        setSize(1000, 700);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
