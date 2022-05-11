package string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
字符修改上的区别：
String：不可变字符串；
StringBuffer：可变字符串、效率低、线程安全；
StringBuilder：可变字符序列、效率高、线程不安全；
小结：
1、如果要操作少量的数据用 String；
2、多线程操作字符串缓冲区下操作大量数据 StringBuffer；
3、单线程操作字符串缓冲区下操作大量数据 StringBuilder（推荐使用）。
 */
public class StringTest {
    public static String BASEINFO = "Mr.Y";
    public static final int COUNT = 2000000;

    /**
     * 执行一项String赋值测试
     */
    public static void doStringTest() {

        String str = new String(BASEINFO);
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < COUNT / 100; i++) {
            str = str + "miss";
        }
        long endtime = System.currentTimeMillis();
        System.out.println((endtime - starttime)
                + " millis has costed when used String.");
    }

    /**
     * 执行一项StringBuffer赋值测试
     */
    public static void doStringBufferTest() {

        StringBuffer sb = new StringBuffer(BASEINFO);
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            sb = sb.append("miss");
        }
        long endtime = System.currentTimeMillis();
        System.out.println((endtime - starttime)
                + " millis has costed when used StringBuffer.");
    }

    /**
     * 执行一项StringBuilder赋值测试
     */
    public static void doStringBuilderTest() {

        StringBuilder sb = new StringBuilder(BASEINFO);
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            sb = sb.append("miss");
        }
        long endtime = System.currentTimeMillis();
        System.out.println((endtime - starttime)
                + " millis has costed when used StringBuilder.");
    }

    /**
     * 测试StringBuffer遍历赋值结果
     *
     * @param mlist
     */
    public static void doStringBufferListTest(List<String> mlist) {
        StringBuffer sb = new StringBuffer();
        long starttime = System.currentTimeMillis();
        for (String string : mlist) {
            sb.append(string);
        }
        long endtime = System.currentTimeMillis();
        System.out.println(sb.toString() + "buffer cost:"
                + (endtime - starttime) + " millis");
    }

    /**
     * 测试StringBuilder迭代赋值结果
     *
     * @param mlist
     */
    public static void doStringBuilderListTest(List<String> mlist) {
        StringBuilder sb = new StringBuilder();
        long starttime = System.currentTimeMillis();
        for (Iterator<String> iterator = mlist.iterator(); iterator.hasNext(); ) {
            sb.append(iterator.next());
        }

        long endtime = System.currentTimeMillis();
        System.out.println(sb.toString() + "builder cost:"
                + (endtime - starttime) + " millis");
    }

    public static void main(String[] args) {
        doStringTest();
        doStringBufferTest();
        doStringBuilderTest();

        List<String> list = new ArrayList<String>();
        list.add(" Money ");
        list.add(" is ");
        list.add(" most ");
        list.add(" important ");
        list.add(" . ");
        doStringBufferListTest(list);
        doStringBuilderListTest(list);
        System.out.println("String:");
        String s = "abc";
        String s1 = "";
        System.out.println(s);
        System.out.println(s1);
        System.out.println("StringBuffer:");
        //StringBuffer s2 ="abc";这里会报错
        StringBuffer s2 = null;
        StringBuffer s3 = new StringBuffer();//StringBuffer对象是一个空的对象
        s3.append(100);
        StringBuffer s4 = new StringBuffer("abc");//创建带有内容的StringBuffer对象,对象的内容就是字符串
        s4.append(100);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("StringBuilder:");
        StringBuilder s5 = null;
        StringBuilder s6 = new StringBuilder();
        s6.append(100);
        StringBuilder s7 = new StringBuilder("abc");
        s7.append(100);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
    }
}
