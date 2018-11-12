package example_paint;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.util.Vector;
import javax.swing.*;

public class BrushPanel extends JPanel {

    public Vector<Point> pointVector = new Vector<>();

    public int thickness = 1;

    private Color brushColor;

    public BrushPanel() {
        this.setBackground(Color.WHITE);

        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

            }

            public void mouseReleased(MouseEvent e) {

            }

            public void mouseClicked(MouseEvent e) {

            }
        });

        this.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {

            }
        });
    }

    public void setColor(Color newColor) {
        this.brushColor = newColor;
    }
}
