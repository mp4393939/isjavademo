package string;

import java.util.*;

public class RemoveRepeated {
    public static void main(String[] args) {
        // ���ַ���ȥ��
        String str = "qwertyuiopqesdxsfzsxxqwer";
        System.out.println(sub(str));
        System.out.println(sub1(str));
    }

    //����1
    static String sub(String str) {
        //StringBuffer()����һ��û���ַ����ַ�������������ʼ����Ϊ16���ַ�
        StringBuffer result = new StringBuffer();
        List list = new ArrayList();
        //toCharArray()���ַ���ת��Ϊ�ַ�����
        char[] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (!list.contains(cs[i])) {
                result.append(cs[i]);
                list.add(cs[i]);
            }
        }
        return result.toString();
    }

    //����2
    static String sub1(String str) {
        List list = new ArrayList();
        StringBuffer sb = new StringBuffer(str);
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (list.contains(str.charAt(i))) {
                sb.deleteCharAt(i - j);     //string ��û��delete������
                j++;
                //��Ϊɾ����sb�е��ַ�����һ��ƫ��
            } else {
                list.add(str.charAt(i));
            }
        }
        return sb.toString();
    }

}
