package pets;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JCanvas extends JComponent {
    public JCanvas() {
        setDoubleBuffered(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        Dimension size = getSize();
        g.setColor(getBackground());
        g.fillRect(0, 0, size.width, size.height);
    }
}

class TestJCanvas {

    public static void main(String[] args) {
        MyWindowListener l = new MyWindowListener();
        JCanvas c = new JCanvas();
        c.setBackground(Color.yellow);
        JFrame f = new JFrame("Test JCanvas...");
        f.addWindowListener(l);
        f.getContentPane().add(c, BorderLayout.CENTER);
        f.pack();
        f.setSize(500, 400);
        f.show();
    }
}

class MyWindowListener extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);

    }
}