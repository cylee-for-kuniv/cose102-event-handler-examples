package example_05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseHandler extends MouseAdapter {
    private ColorPanel buttonsPanel;

    public MouseHandler(ColorPanel buttonsPanel) {
        this.buttonsPanel = buttonsPanel;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        paintPanel(buttonsPanel.pressedPanel, Color.RED);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        paintPanel(buttonsPanel.releasedPanel, Color.ORANGE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        paintPanel(buttonsPanel.clickedPanel, Color.YELLOW);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        paintPanel(buttonsPanel.enteredPanel, Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        paintPanel(buttonsPanel.exitedPanel, Color.CYAN);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        paintPanel(buttonsPanel.draggedPanel, Color.BLUE);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        paintPanel(buttonsPanel.movedPanel, Color.PINK);
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        paintPanel(buttonsPanel.wheelMovedPanel, Color.MAGENTA);
    }

    private void paintPanel(JPanel button, Color color) {
        button.setBackground(color);
    }
}
