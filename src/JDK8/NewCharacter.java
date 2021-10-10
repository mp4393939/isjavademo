package JDK8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.TreeSet;

public class NewCharacter {
    public static void main(String[] args) {
        normal();
        lambda();
        DateAPI();
    }

    public static void normal() {
        //匿名内部类
        Comparator<Integer> cpt = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        TreeSet<Integer> set = new TreeSet<>(cpt);
        System.out.println("set" + set);
        System.out.println("=========================");
    }

    public static void lambda() {
        /*使用lambda表达式
        1、使用Lambda必须有接口，并且接口中有且仅有一个抽象方法。
        只有当接口中的抽象方法存在且唯一时，才可以使用Lambda，但排除接口默认方法以及声明中覆盖Object的公开方法。
        2、使用Lambda必须具有上下文推断。
        也就是方法的参数或局部变量类型必须为Lambda对应的接口类型，才能使用Lambda作为该接口的实例。
        3、备注：有且仅有一个抽象方法的接口，称为“函数式接口”。*/
        Comparator<Integer> cpt2 = (x, y) -> Integer.compare(x, y);
        TreeSet<Integer> set2 = new TreeSet<>(cpt2);
        System.out.println("set2" + set2);
        System.out.println("=========================");
    }

    public static void DateAPI() {
        //新的日期API LocalDate | LocalTime | LocalDateTime，从默认时区的系统时钟获取当前的日期时间。不用考虑时区差
        LocalDate date1 = LocalDate.now();
        //日期
        System.out.println(date1);
        LocalTime date2 = LocalTime.now();
        //时间
        System.out.println(date2);
        LocalDateTime date3 = LocalDateTime.now();
        //日期+时间
        System.out.println(date3);
    }
}
