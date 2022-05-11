package time;
// Demonstrate SimpleDateFormat.

import java.text.*;
import java.util.*;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("E MMM dd yyyy");
        System.out.println(sdf.format(date));
        SimpleDateFormatDemo sd = new SimpleDateFormatDemo();
        sd.GetToadyTime();
    }

    protected void GetToadyTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY��MM��dd�� HH:mm:ss zzzz");
        System.out.println(sdf.format(date));
    }
}
