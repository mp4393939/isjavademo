package time;
// A Simple example of LocalDate and LocalTime.

import java.time.*;

public class DateTimeDemo1 {
    public static void main(String[] args) {

        LocalDate curDate = LocalDate.now();
        System.out.println(curDate);

        LocalTime curTime = LocalTime.now();
        System.out.println(curTime);
    }
}
