package time;
// Demonstrate time formats.

import java.text.*;
import java.util.*;

public class DateFormatDemo extends SimpleDateFormatDemo {

    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df;

        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Japan: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
        System.out.println("Korea: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        System.out.println("United Kingdom: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println("United States: " + df.format(date));
        SimpleDateFormatDemo a = new DateFormatDemo();
        a.GetToadyTime();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SimpleDateFormatDemo b = new SimpleDateFormatDemo();
        b.GetToadyTime();
    }
}