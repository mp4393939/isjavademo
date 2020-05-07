package time;

import java.applet.Applet;
import java.awt.*;
import java.text.DateFormat;
import java.util.*;

public class Watch extends Applet {
    @Override
    public void paint(Graphics g) {
        Date d = new Date();
        DateFormat ldf = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        //System.out.println("现在系统时间是(long)："+ ldf.format(d));
        String time = ldf.format(d);
        g.drawString(time, 100, 100);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        repaint();
    }
}