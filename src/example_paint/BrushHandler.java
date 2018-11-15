package example_paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BrushHandler implements ActionListener {

    private MainFrame mainFrame;
    
    public BrushHandler(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // set brush color
    }
}
