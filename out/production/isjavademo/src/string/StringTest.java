package string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
�ַ��޸��ϵ�����
String�����ɱ��ַ�����
StringBuffer���ɱ��ַ�����Ч�ʵ͡��̰߳�ȫ��
StringBuilder���ɱ��ַ����С�Ч�ʸߡ��̲߳���ȫ��
С�᣺
1�����Ҫ���������������� String��
2�����̲߳����ַ����������²����������� StringBuffer��
3�����̲߳����ַ����������²����������� StringBuilder���Ƽ�ʹ�ã���
 */
public class StringTest {
    public static String BASEINFO = "Mr.Y";
    public static final int COUNT = 2000000;

    /**
     * ִ��һ��String��ֵ����
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
     * ִ��һ��StringBuffer��ֵ����
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
     * ִ��һ��StringBuilder��ֵ����
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
     * ����StringBuffer������ֵ���
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
     * ����StringBuilder������ֵ���
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
        //StringBuffer s2 ="abc";����ᱨ��
        StringBuffer s2 = null;
        StringBuffer s3 = new StringBuffer();//StringBuffer������һ���յĶ���
        s3.append(100);
        StringBuffer s4 = new StringBuffer("abc");//�����������ݵ�StringBuffer����,��������ݾ����ַ���
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
