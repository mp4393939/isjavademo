package string;

import java.util.*;

public class RemoveRepeated {
    public static void main(String[] args) {
        // 对字符串去重
        String str = "qwertyuiopqesdxsfzsxxqwer";
        System.out.println(sub(str));
        System.out.println(sub1(str));
    }

    //方法1
    static String sub(String str) {
        //StringBuffer()构造一个没有字符的字符串缓冲区，初始容量为16个字符
        StringBuffer result = new StringBuffer();
        List list = new ArrayList();
        //toCharArray()将字符串转换为字符数组
        char[] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (!list.contains(cs[i])) {
                result.append(cs[i]);
                list.add(cs[i]);
            }
        }
        return result.toString();
    }

    //方法2
    static String sub1(String str) {
        List list = new ArrayList();
        StringBuffer sb = new StringBuffer(str);
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (list.contains(str.charAt(i))) {
                sb.deleteCharAt(i - j);     //string 是没有delete方法的
                j++;
                //因为删除了sb中的字符，有一个偏移
            } else {
                list.add(str.charAt(i));
            }
        }
        return sb.toString();
    }

}
