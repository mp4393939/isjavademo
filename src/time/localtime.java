package time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

//��Ĭ��ʱ����ϵͳʱ�ӻ�ȡ��ǰ������ʱ�䣬��ת��ָ���ĸ�ʽ.
public class localtime {

    public static void main(String[] args) {

    }

    void gettime() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        String localTime = df.format(time);
        LocalDateTime ldt = LocalDateTime.parse("2017-09-28 17:07:05", df);
        System.out.println("LocalDateTimeת��String���͵�ʱ�䣺" + localTime);
        System.out.println("String���͵�ʱ��ת��LocalDateTime��" + ldt);
    }

    void localtime(String isTime) {
        String Time = isTime;
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        String localTime = df.format(time);
        System.out.println(Time);
    }

    void gettime_1() {
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyyMMdd_HH_mm_ss");
        LocalDateTime time1 = LocalDateTime.now();
        String localTime1 = df1.format(time1);
        System.out.println("LocalDateTimeת��String���͵�ʱ�䣺" + localTime1);
    }

    void super1(int i, int j) {
        System.out.println(i + j);
    }


}
