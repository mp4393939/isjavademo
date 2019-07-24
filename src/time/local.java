package time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//从默认时区的系统时钟获取当前的日期时间，并转成指定的格式.
public class local {

    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        String localTime = df.format(time);
        LocalDateTime ldt = LocalDateTime.parse("2017-09-28 17:07:05", df);
        System.out.println("LocalDateTime转成String类型的时间：" + localTime);
        System.out.println("String类型的时间转成LocalDateTime：" + ldt);

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyyMMdd_HH_mm_ss");
        String localTime1 = df1.format(time);
        System.out.println("LocalDateTime转成String类型的时间：" + localTime1);
    }
}
