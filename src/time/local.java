package time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//��Ĭ��ʱ����ϵͳʱ�ӻ�ȡ��ǰ������ʱ�䣬��ת��ָ���ĸ�ʽ.
public class local {

    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        String localTime = df.format(time);
        LocalDateTime ldt = LocalDateTime.parse("2017-09-28 17:07:05", df);
        System.out.println("LocalDateTimeת��String���͵�ʱ�䣺" + localTime);
        System.out.println("String���͵�ʱ��ת��LocalDateTime��" + ldt);

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyyMMdd_HH_mm_ss");
        String localTime1 = df1.format(time);
        System.out.println("LocalDateTimeת��String���͵�ʱ�䣺" + localTime1);
    }
}
