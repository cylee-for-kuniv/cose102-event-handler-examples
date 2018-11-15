package example_05;

import java.awt.*;
import javax.swing.*;

public class ColorPanel extends JPanel{
    public JPanel pressedPanel = new JPanel();
    public JPanel releasedPanel = new JPanel();
    public JPanel clickedPanel = new JPanel();
    public JPanel enteredPanel = new JPanel();
    public JPanel exitedPanel = new JPanel();
    public JPanel draggedPanel = new JPanel();
    public JPanel movedPanel = new JPanel();
    public JPanel wheelMovedPanel = new JPanel();

    public ColorPanel() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));
        this.setBackground(Color.GRAY);

        JPanel panelArray[] = { pressedPanel, releasedPanel, clickedPanel,
                enteredPanel, exitedPanel, draggedPanel,
                movedPanel, wheelMovedPanel };

        for(JPanel panel:panelArray) {
            panel.setBackground(Color.WHITE);
            panel.setSize(200, 100);
            this.add(panel);

        }
    }
}
