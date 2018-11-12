package example_02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("ActionEventListener Example 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel jLabel = new JLabel("Programming is Fun!");

        JButton javaBtn = new JButton("Java");
        JButton pythonBtn = new JButton("Python");
        JButton cSharpBtn = new JButton("C#");

        javaBtn.addActionListener(new ProgrammingIsFun(jLabel));
        pythonBtn.addActionListener(new ProgrammingIsFun(jLabel));
        cSharpBtn.addActionListener(new ProgrammingIsFun(jLabel));

        container.add(javaBtn);
        container.add(pythonBtn);
        container.add(cSharpBtn);
        container.add(jLabel);

        setSize(250, 120);
        setVisible(true);
    }

    class ProgrammingIsFun implements ActionListener {
        private JLabel jLabel;

        public ProgrammingIsFun(JLabel jLabel) {
            this.jLabel = jLabel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton)e.getSource();
            jLabel.setText(button.getText() + " is Fun!");
        }
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
