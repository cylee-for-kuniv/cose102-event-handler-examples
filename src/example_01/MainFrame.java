package example_01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("ActionEventListener Example 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JButton jButton = new JButton("Java");
        jButton.addActionListener(new ActionHandler());

        container.add(jButton);

        setSize(250, 120);
        setVisible(true);
    }

    class ActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton)e.getSource();
            if (button.getText().equals("Java")) button.setText("Python");
            else button.setText("Java");
        }
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
