package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class indexOf_Str {
    public static void main(String[] args) throws IOException {
        //��ȡһ���ı����ַ���,str="ABCDEFGHIJKLMN"
        BufferedReader in = new BufferedReader(new FileReader("E:\\jmeter\\Orders.txt"));
        String txt = null;
        int line = 1;
        //����һ�����ַ��������ܶ������ַ���
        String str = "";
//ѭ���Ѷ�ȡ�����ַ�����str
        while ((txt = in.readLine()) != null) {
            str += txt;
        }
        System.out.println("str=" + str);
//�ж�str���Ƿ���EFG�Ӵ���Ϊtrue��˵����,��ȥif���
        if (str.contains("LMN")) {
            System.out.println("yes");
//ȡ���Ӵ��ĳ�ʼλ��
            int i = str.indexOf("LMN");
//���ݵ�Ҫȡ�����ݺ�����ַ�+���ٸ�
            String strLMN = str.substring(i, i + 3);
            System.out.println(strLMN);
        }
    }
}
